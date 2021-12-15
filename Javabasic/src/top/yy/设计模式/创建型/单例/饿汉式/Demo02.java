package top.yy.设计模式.创建型.单例.饿汉式;

public class Demo02 {

    private Demo02() {}
    private static Demo02 instance;
    static {
        instance = new Demo02();
    }
    public static Demo02 getInstance() {
        return instance;
    }
}
