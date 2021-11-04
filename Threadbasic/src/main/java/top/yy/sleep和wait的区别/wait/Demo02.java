package top.yy.sleep和wait的区别.wait;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

/**
 * wait不会占用锁 还会把线程放入等待队列中
 *
 * 输出结果
 * 线程1正在执行 开始时间 15:43:46.040
 * 线程2正在执行 开始时间 15:43:46.040
 * 线程1wait结束 结束时间 15:43:49.040
 * 线程2wait结束 结束时间 15:43:49.040
 *
 * Process finished with exit code 0
 * 可以看到 在获得线程1 的执行后
 * 使用wait方法使得线程1进入阻塞状态
 * wait 不仅将线程1 放入了阻塞状态 还会释放这个对象的锁
 * 线程2 会开始执行
 *
 * 重要：
 * 每个对象都有一把锁 sleep是不会去释放这把锁的
 * wait 不仅会释放锁 还会加入到等待队列中
 */
public class Demo02 {

    private final static Object lock = new Object();
    public static void main(String[] args) {
        Stream.of("线程1", "线程2").forEach(n -> new Thread(n) {
            public void run() {
                Demo02.testWait();
            }
        }.start());
    }
    private static void testWait() {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + "正在执行 开始时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
                lock.wait(3_000);
                System.out.println(Thread.currentThread().getName()
                        + "wait结束 结束时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
