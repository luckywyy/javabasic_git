package top.yy.继承Thread类;

import java.util.Vector;

public class Demo01 {

    public static void main(String[] args) {


        Count01 count01 = new Count01();
        count01.start();

        Count02 count02 = new Count02();
        count02.start();
    }
}
