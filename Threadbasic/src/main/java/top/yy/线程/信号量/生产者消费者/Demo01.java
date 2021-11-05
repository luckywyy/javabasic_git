package top.yy.线程.信号量.生产者消费者;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者消费者问题
 *
 * 个人理解：
 * 生产和消费是异步的 和买票卖票问题一样
 * 需要对共享资源进行保护 否则数据不安全
 *
 * 给run中对共享资源的访问代码上一把锁
 */
public class Demo01 {

    public static void main(String[] args) {

        new Demo01().start_();
    }

    void start_ () {

        customer customer = new customer();
        productor productor = new productor();

        Thread thread = new Thread(productor, "t-1");
        Thread thread1 = new Thread(customer, "t-2");
        thread.start();
        thread1.start();

        /**
         * 这里消费者休眠时间更长
         * 如果不设置优先级下，休眠后就切换了
         * 也许下一个时间片还是消费者占用
         * 如果设置优先级 理论上生产者会占用更多时间片 不会等消费者全部消耗掉才继续生产
         */

//        线程优先级有10个等级，分别用整数1-10表示。其中1位最低优先级，10为最高优先级，5为默认值。
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

    }

    private int gifts = 0;
    Lock lock = new ReentrantLock();

    class productor implements Runnable{

        @Override
        public void run() {
            while (true) {
                if (gifts < 10) {
                    lock.lock();
                    gifts++;
                    System.out.println("生产了 =======> " + gifts);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                }
            }
        }
    }

    class customer implements Runnable {

        @Override
        public void run() {
            while (true) {
                if (gifts > 0) {
                    lock.lock();
                    System.out.println("正在消费 ---> " + gifts);
                    gifts--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                }
            }
        }
    }

}


