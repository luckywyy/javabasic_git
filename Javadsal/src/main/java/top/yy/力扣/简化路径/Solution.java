package top.yy.力扣.简化路径;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: javabasic_git-top.yy.力扣.简化路径
 * @description:
 * @author:
 * @create: 2021-12-24 13:57
 **/
public class Solution {

    public String simplifyPath(String path) {
//        去掉多余的斜杠
        char[] chars = path.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '/') {
                characters.add(chars[i]);
                flag = true;
            }
            if (chars[i] == '/' && flag) {
                characters.add(chars[i]);
                flag = false;
            }
            if (chars[i] == '/' && !flag) {
                continue;
            }
        }




//        Stack<Character> stack = new Stack<>();
//        Queue<Character> list = new LinkedList<>();
//        for (char c: path.toCharArray()) {
//            if (c != '/') {
//                list.offer(c);
//            }
//        }

        return null;
    }
    public String simplifyPath2(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder ret = new StringBuilder();
        for (String p : path.split("/")) {
            if (!stack.empty() && p.equals("..")) {
                stack.pop();
            } else if (!" ..".contains(p)) {
                stack.push(p);
            }
        }
        for (String i : stack) {
            ret.append("/" + i);
        }
        return ret.length() == 0 ? "/" : ret.toString();
    }

    public static void main(String[] args) {

        String s = new Solution().simplifyPath("/a//////./b/../../c/");
        System.out.println(s);
    }
}
