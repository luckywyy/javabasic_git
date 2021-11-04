package top.yy.sleep和wait的区别.wait;

/**
 * wait()是Object类的方法，当一个线程执行到wait方法时，
 * 它就进入到一个和该对象相关的等待池，同时释放对象的机锁，使得其他线程能够访问，
 * 可以通过notify，notifyAll方法来唤醒等待的线程
 *
 * 这里需要使用notify或者 notifyAll方法来唤醒等待的线程
 */
public class Demo01 {
    public static void main(String[] args) {
        Service service = new Service();
        new Thread(new ServiceWaitThread(service)).start();
        new Thread(new ServiceSleepThread(service)).start();
    }

}
