package top.yy.力扣.有效的括号;

/**
 * @program: javabasic_git-top.yy.力扣.有效的括号
 * @description:
 * @author:
 * @create: 2021-12-21 19:57
 **/
class Solution {
    public boolean isValid(String s) {
        
        char[] chars = s.toCharArray();
        for (char c : chars) {

        }

    }

    public static void main(String[] args) {
        String s = "()[]{}";
        boolean valid = new Solution().isValid(s);
        System.out.println(valid);
    }
}