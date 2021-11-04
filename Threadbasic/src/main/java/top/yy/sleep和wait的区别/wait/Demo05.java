package top.yy.sleep和wait的区别.wait;


import javax.swing.plaf.TableHeaderUI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * 加了同步代码块 且传入的是同一个lock对象
 * 先获得cpu资源的会执行完
 *
 * 如果给A类的lock加入wait
 * 这个时候 如果A类优化获取到了cpu资源
 * 但是程序不会停止在A这里 wait会释放锁
 * B是能运行的 B会执行完 如果B同步块中的执行完不将lock使用notify或notifyAll方法来唤醒
 * 那么A会一直等待
 *
 * 这里如果不使用wait
 * 给A中wait处替换成Thread.sleep方法，那么A等待后 整个程序会自动继执行完成 无需唤醒
 *
 * ================================
 * 注意 这里是同一个lock对象喔 如果全替换成this 不是一个实例 A还是会等待
 */
public class Demo05 {

    public static void main(String[] args) {
        Object lock = new Object();
        A a = new A(lock);
        B b = new B(lock);
        new Thread(a, "A").start();
        new Thread(b, "B").start();
    }
}

class A implements Runnable {
    private Object lock;

    public A(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
//                Thread.sleep(3_000);
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---" + Integer.valueOf(i).toString()
                        +"正在执行 开始时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
            }
        }
    }
}

class B implements Runnable {
    private Object lock;

    public B(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---" + Integer.valueOf(i).toString()
                        +"正在执行 开始时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
            }
//            lock.notifyAll();
        }
    }
}
