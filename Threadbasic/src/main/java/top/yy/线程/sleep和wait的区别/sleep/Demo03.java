package top.yy.线程.sleep和wait的区别.sleep;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

/**
 * sleep不依赖同步方法 wait需要
 *
 * 输出结果
 * 线程1休眠开始 开始时间 15:51:05.938
 * 线程2休眠开始 开始时间 15:51:05.938
 * 线程1休眠结束 结束时间 15:51:08.940
 * 线程2休眠结束 结束时间 15:51:08.940
 *
 * Process finished with exit code 0
 */
public class Demo03 {
    private final static Object lock = new Object();
    public static void main(String[] args) {
        Stream.of("线程1", "线程2").forEach(n -> new Thread(n) {
            public void run() {
                Demo03.testSleep();
            }
        }.start());
    }
    private static void testSleep() {
        try {
            System.out.println(Thread.currentThread().getName() + "休眠开始 开始时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
            Thread.sleep(3_000);
            System.out.println(Thread.currentThread().getName() + "休眠结束 结束时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
