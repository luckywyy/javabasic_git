package top.yy.力扣.适龄的朋友;

import java.util.Arrays;

/**
 * @program: javabasic_git-top.yy.力扣.适龄的朋友
 * @description: 满足以下任意条件均不会发送请求
 * age[y] <= 0.5 * age[x] + 7
 * age[y] > age[x]
 * age[y] > 100 && age[x] < 100
 * @author:
 * @create: 2021-12-27 19:02
 **/
public class Solution {
    public int numFriendRequests(int[] ages) {
        int ret = 0;

        for (int i = 0; i < ages.length; i++) {
            for (int j = i; j < ages.length; j++) {
                if (i != j) {
                    ret += judgeFriend(ages[i], ages[j]);
                    ret += judgeFriend(ages[j], ages[i]);
                }
            }
        }

        return ret;
    }

    public int judgeFriend(int a, int b) {
        if (a <= (b * 0.5 + 7)) {
            return 0;
        }
        if ( a > b) {
            return 0;
        }
        if (a > 100 && b < 100) {
            return 0;
        }
        return 1;
    }

    public int numFriendRequests2(int[] ages) {
        int n = ages.length;
        Arrays.sort(ages);
        int left = 0, right = 0, ans = 0;
        for (int age : ages) {
            if (age < 15) {
                continue;
            }
            while (ages[left] <= 0.5 * age + 7) {
                ++left;
            }
            while (right + 1 < n && ages[right + 1] <= age) {
                ++right;
            }
            ans += right - left;
        }
        return ans;
    }


    public static void main(String[] args) {

//        int[] ages = new int[] {20,30,100,110,120};
        int[] ages = new int[] {};
        int i = new Solution().numFriendRequests(ages);
        System.out.println(i);

    }
}
