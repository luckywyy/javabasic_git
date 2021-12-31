package top.yy.力扣.第一个错误的版本;

/**
 * @program: javabasic_git-top.yy.力扣.第一个错误的版本
 * @description:
 * @author:
 * @create: 2021-12-28 19:41
 **/
public class Solution {
    public int firstBadVersion(int n) {
        if (n==1){
            return 1;
        }
        int left = 1;
        int right = n;
        int mid = (left + right) / 2;
        while (true) {
            if (mid == 1 && isBadVersion(mid)) break;
            if (isBadVersion(mid) && !isBadVersion(mid-1)) break;
            if (isBadVersion(mid)) {
                right = mid;
                mid = (left + right) / 2;
            }
            if (!isBadVersion(mid)) {
                left = mid;
                mid = (left + right) / 2;
            }
        }
        return mid;
    }
    public boolean isBadVersion(int v) {
        if (v>=112312312){
            return true;
        } else {
            return false;
        }
    }

    public int firstBadVersion2(int n) {
        if (n==1){
            return 1;
        }
        int ret = -1;
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i) && !isBadVersion(i-1)) {
                ret = i;
                break;
            }
        }
        return ret;
    }

    public int firstBadVersion3(int n) {
        if (n==1){
            return 1;
        }
        int ret = -1;
        for (int i = 1; i <= n; i++) {
            if (!isBadVersion((i+n)/2)) {
                i = (i+n)/2;
                continue;
            }
            if (isBadVersion(i) && !isBadVersion(i-1)) {
                ret = i;
                break;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(412312312));
    }
}
