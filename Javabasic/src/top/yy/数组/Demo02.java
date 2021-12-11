package top.yy.数组;

import java.util.Arrays;

public class Demo02 {

    public static void main(String[] args) {

        int nums[] = new int[10];
        nums[2] = 11;
        nums[4] = 4;

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
