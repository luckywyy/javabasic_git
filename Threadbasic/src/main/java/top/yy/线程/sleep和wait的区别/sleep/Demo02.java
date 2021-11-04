package top.yy.线程.sleep和wait的区别.sleep;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;


/**
 * 如下例子
 * 只有当优先抢到cpu资源的线程执行完 才会继续执行下一个线程
 *
 * 输出结果
 * 线程1正在执行 开始时间 15:41:08.667
 * 线程1休眠结束 结束时间 15:41:11.669
 * 线程2正在执行 开始时间 15:41:11.669
 * 线程2休眠结束 结束时间 15:41:14.677
 *
 * Process finished with exit code 0
 *
 */
public class Demo02 {

    private final static Object lock = new Object();
    public static void main(String[] args) {
        Stream.of("线程1","线程2").forEach(n->new Thread(n) {
            public void run(){
                Demo02.testSleep();
            }
        }.start());
    }
    //sleep方法休眠之后，
    private static void testSleep() {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName()
                        +"正在执行 开始时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
                Thread.sleep(3_000);
                System.out.println(Thread.currentThread().getName()
                        +"休眠结束 结束时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
