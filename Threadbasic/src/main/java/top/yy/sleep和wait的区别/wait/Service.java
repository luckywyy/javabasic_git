package top.yy.sleep和wait的区别.wait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Service {

    public void msleep() {
        synchronized (this) {
            try {
                System.out.println("此方法线程休眠3秒 "+System.currentTimeMillis());
                System.out.println(new SimpleDateFormat("yy:MM:dd HH:mm:ss.SSS").format(new Date()));
                Thread.sleep(3000);

//                使用wait方法 需要唤醒
                this.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void mwait() {
        synchronized (this) {
            System.out.println("结束时间 "+System.currentTimeMillis());
            System.out.println(new SimpleDateFormat("yy:MM:dd HH:mm:ss.SSS").format(new Date()));

//            进行等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
