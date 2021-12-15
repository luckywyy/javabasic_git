package top.yy.设计模式.创建型.单例.饿汉式;

public class Demo01 {

    private Demo01() {}
    private static Demo01 INSTANCE = new Demo01();
    public static Demo01 getInstance() {
        return INSTANCE;
    }
}
