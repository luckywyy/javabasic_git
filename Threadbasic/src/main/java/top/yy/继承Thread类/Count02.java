package top.yy.继承Thread类;

import java.util.Vector;

public class Count02 extends Thread{
    public void count() {
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < 500; i++) {
            vector.add(Count02.class.getName() + "----" + Integer.valueOf(i).toString());
        }
        for (String s : vector) {
            System.out.println(s);
        }

    }

    @Override
    public void run() {
        this.count();
    }
}
