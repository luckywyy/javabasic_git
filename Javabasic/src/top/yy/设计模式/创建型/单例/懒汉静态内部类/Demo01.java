package top.yy.设计模式.创建型.单例.懒汉静态内部类;

/**
 * @program: javabasic_git
 * @description: 实例由内部类创建，JVM在加载外部类过程中，并不会加载静态内部类，只有内部类的属性方法
 * 被调用时才会加载，并初始化其静态方法，静态属性被static修饰，保证只被实例化一次，并且严格保证实例化顺序
 * 也就是上个方式中加的volatile关键字
 * @author:
 * @create: 2021-12-15 14:22
 **/
public class Demo01 {
    private Demo01 instance;
    private static class Demo01Holder {
        private static final Demo01 INSTANCE = new Demo01();
    }
    public static Demo01 getInstance() {
        return Demo01Holder.INSTANCE;
    }
}
