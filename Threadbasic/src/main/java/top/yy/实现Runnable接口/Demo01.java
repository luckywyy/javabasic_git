package top.yy.实现Runnable接口;

import top.yy.继承Thread类.Count01;

import java.sql.Timestamp;
import java.util.Vector;

public class Demo01 implements Runnable{
    public void run() {

        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < 50; i++) {
            vector.add(Thread.currentThread().getName() + "----" + Integer.valueOf(i).toString());
        }
        for (String s : vector) {
            System.out.println(s);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Demo01 demo01 = new Demo01();
        new Thread(demo01, "t1").start();
        new Thread(demo01, "t2").start();
        new Thread(demo01, "t3").start();
    }
}
