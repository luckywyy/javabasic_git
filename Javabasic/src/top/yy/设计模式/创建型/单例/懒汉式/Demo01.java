package top.yy.设计模式.创建型.单例.懒汉式;

/**
 * 饿汉式对象在static中，因此只保留一份，类加载时创建
 * 懒汉式即不使用时不创建，只有调用后才创建
 * 但是这里式线程不安全的，因为可能有多个线程判断是否为空
 * 但是并没有执行到下面创建对象的语句
 * 解决方法可以加同步锁 syn关键字等
 */
public class Demo01 {
    private Demo01 () {}

    private static Demo01 instance;

    public static Demo01 getInstance() {
        if (instance == null) {
            instance = new Demo01();
        }
        return instance;
    }

//    public static synchronized Demo01 getInstance() {
//        if (instance == null) {
//            instance = new Demo01();
//        }
//        return instance;
//    }
}
