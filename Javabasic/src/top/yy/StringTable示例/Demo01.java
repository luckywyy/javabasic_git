package top.yy.StringTable示例;

/**
 * @program: javabasic_git-top.yy.StringTable示例
 * @description:
 * @author:
 * @create: 2021-12-31 15:44
 **/
public class Demo01 {
    public static void main(String[] args) {
        String s2 = new String("a") + new String("b");
        /**
         * intern方法会把ab放入串池 后面ab如果找到 那么就用之前的
         * 将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池，会把串池中的对象返回
         */
        s2 = s2.intern();
        System.out.println(s2 == "ab");
    }
}
