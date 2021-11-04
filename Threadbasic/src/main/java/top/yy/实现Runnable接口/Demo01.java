package top.yy.实现Runnable接口;

import top.yy.继承Thread类.Count01;

import java.sql.Timestamp;
import java.util.Vector;

/**
 * 实现runnable接口
 * 需要把实现类实例放入Thread类构造器中，最好再给个名称
 * 还是通过start方法调用
 * 在Runnable接口中 仍把需要运行的方法体放入了run方法中
 */
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
