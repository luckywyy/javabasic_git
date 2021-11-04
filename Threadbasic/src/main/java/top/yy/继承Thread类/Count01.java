package top.yy.继承Thread类;

import javax.swing.*;
import java.util.Vector;
import java.util.concurrent.locks.Lock;

public class Count01 extends Thread{
    public void count() {
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < 500; i++) {
            vector.add(Count01.class.getName() + "----" + Integer.valueOf(i).toString());
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
