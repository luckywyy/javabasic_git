package top.yy.力扣.简化路径;

import java.util.ArrayList;

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

    public static void main(String[] args) {

        String s = new Solution().simplifyPath("/a//////./b/../../c/");
        System.out.println(s);
    }
}
