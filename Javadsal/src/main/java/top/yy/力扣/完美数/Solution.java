package top.yy.力扣.完美数;

/**
 * @program: javabasic_git-top.yy.力扣.完美数
 * @description:
 * @author:
 * @create: 2021-12-31 14:38
 **/
public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }

        int sum = 1;
        for (int d = 2; d * d <= num; ++d) {
            if (num % d == 0) {
                sum += d;
                if (d * d < num) {
                    sum += num / d;
                }
            }
        }
        return sum == num;

    }
    public static void main(String[] args) {

    }
}
