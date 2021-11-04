package top.yy.sleep和wait的区别.sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Service {

    public void msleep() {
        synchronized (this) {
            try {
                System.out.println("此方法线程休眠3秒 "+System.currentTimeMillis());
                System.out.println(new SimpleDateFormat("yy:MM:dd HH:mm:ss.SSS").format(new Date()));
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void mwait() {
        synchronized (this) {
            System.out.println("结束时间 "+System.currentTimeMillis());
            System.out.println(new SimpleDateFormat("yy:MM:dd HH:mm:ss.SSS").format(new Date()));
        }
    }
}
