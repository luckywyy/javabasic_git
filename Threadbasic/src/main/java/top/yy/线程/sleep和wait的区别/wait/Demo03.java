package top.yy.线程.sleep和wait的区别.wait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;


/**
 * 和sleep中demo03不一样的是 这里会出现异常
 * 输出结果
 * 线程2休眠开始 开始时间 15:53:44.573
 * 线程1休眠开始 开始时间 15:53:44.573
 * Exception in thread "线程2" Exception in thread "线程1" java.lang.IllegalMonitorStateException
 * 	at java.lang.Object.wait(Native Method)
 * 	at top.yy.线程.sleep和wait的区别.wait.Demo03.testWait(Demo03.java:38)
 * 	at top.yy.线程.sleep和wait的区别.wait.Demo03.access$000(Demo03.java:26)
 * 	at top.yy.线程.sleep和wait的区别.wait.Demo03$1.run(Demo03.java:31)
 * java.lang.IllegalMonitorStateException
 * 	at java.lang.Object.wait(Native Method)
 * 	at top.yy.线程.sleep和wait的区别.wait.Demo03.testWait(Demo03.java:38)
 * 	at top.yy.线程.sleep和wait的区别.wait.Demo03.access$000(Demo03.java:26)
 * 	at top.yy.线程.sleep和wait的区别.wait.Demo03$1.run(Demo03.java:31)
 *
 * Process finished with exit code 0
 *
 * 从异常可以看出 无论是线程1 还是 线程2 都出现了异常
 *
 */
public class Demo03 {
    private final static Object lock = new Object();
    public static void main(String[] args) {
        Stream.of("线程1", "线程2").forEach(n -> new Thread(n) {
            public void run() {
                Demo03.testWait();
            }
        }.start());

    }
    private static void testWait() {
        try {
            System.out.println(Thread.currentThread().getName() + "休眠开始 开始时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
            lock.wait(3_000);
            System.out.println(Thread.currentThread().getName() + "休眠结束 结束时间 " + new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
