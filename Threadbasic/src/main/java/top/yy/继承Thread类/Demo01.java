package top.yy.继承Thread类;

import java.util.Vector;

public class Demo01 {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < 500; i++) {
            vector.add("Demo01 main" + "----" + Integer.valueOf(i).toString());
        }
        for (String s : vector) {
            System.out.println(s);
        }

        Count01 count01 = new Count01();
        count01.start();

        Count02 count02 = new Count02();
        count02.start();
    }
}
