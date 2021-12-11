package top.yy.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Demo {

    public static void main(String[] args) {


        int[] ints = {1, 1, 2, -1, 1, -2, 3};

        System.out.println(ints);
        System.out.println(ints[4]);
        System.out.println(Arrays.stream(ints).sum());

    }
}
