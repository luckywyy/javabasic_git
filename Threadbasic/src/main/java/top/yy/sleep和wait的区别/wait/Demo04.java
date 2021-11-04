package top.yy.sleep和wait的区别.wait;


/**
 * Demo03中的问题
 * 在这里 准备一个方法 这个方法用于唤醒等待的线程
 */
public class Demo04 {

    private final static Object lock = new Object();
    private static void testWait() {
        synchronized (lock) {
            try {
                System.out.println("我一直在等待");
                lock.wait();
                System.out.println("wait被唤醒了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void notifyWait() {
        synchronized (lock) {
            try {
                Thread.sleep(10_000);
                lock.notify();
                System.out.println("休眠5秒钟唤醒wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread() {//这个线程一直在等待
            public void run() {
                Demo04.testWait();
            }
        }.start();
        new Thread() {//这个线程准备去唤醒
            public void run() {
                Demo04.notifyWait();
            }
        }.start();
    }

}
