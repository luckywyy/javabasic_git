package top.yy.设计模式.创建型.单例.双重检查机制;

/**
 * 在懒汉式当中，所有行为都加了锁
 * 但是并不是所有情况都需要锁
 * 大多数读操作下是不用加锁的，因此在读的时候没必要使用锁
 * 那么需要调整加锁的时机
 * 也就是双重检查机制，也就是两次判断
 */
public class Demo01 {
    private Demo01() {}
    private static Demo01 instance;

    public static Demo01 getInstance() {
//        第一次判断
        if (instance == null) {
            synchronized (Demo01.class) {
                if (instance == null) {
                    instance = new Demo01();
                }
            }
        }

        return instance;
    }
}
