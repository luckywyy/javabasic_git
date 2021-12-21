package top.yy.力扣.有效的括号;

import java.util.Stack;

/**
 * @program: javabasic_git-top.yy.力扣.有效的括号
 * @description:
 * @author:
 * @create: 2021-12-21 19:57
 **/
class Solution {
    public boolean isValid(String s) {

        Stack stack = new Stack();

        char[] chars = s.toCharArray();
        boolean flag = true;
        for (char c : chars) {
            if (flag) {
                stack.push(c);
                flag = false;
                continue;
            }
            if (flag == false) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                    continue;
                }
                char now_pop = (char) stack.pop();
                if (now_pop == '(' && c == ')' || now_pop == '[' && c == ']' || now_pop == '{' && c == '}') {
                    if (stack.empty()) {
                        flag = true;
                    }
                    continue;
                } else {
                    return false;
                }
            }
        }
//        while (!stack.empty()) {
//            System.out.println(stack.pop().toString());
//        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
//        return true;
    }

    public static void main(String[] args) {
        String s = "{{}}{}[](){}[";
        boolean valid = new Solution().isValid(s);
        System.out.println(valid);
    }
}