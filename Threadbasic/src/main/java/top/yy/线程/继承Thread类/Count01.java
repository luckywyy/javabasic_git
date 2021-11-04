package top.yy.线程.继承Thread类;

import java.util.Vector;

public class Count01 extends Thread{
    public void count() {
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < 50; i++) {
            vector.add(Count01.class.getName() + "----" + Integer.valueOf(i).toString());
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

    @Override
    public void run() {
        this.count();
    }
}
