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
    public int firstBadVersion4(int n) {
        int left = 1, right = n;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            if (isBadVersion(mid)) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(412312312));
    }
}
