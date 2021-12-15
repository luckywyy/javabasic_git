package top.yy.设计模式.创建型.单例.序列化破环单例解决方案;

/**
 * @program: javabasic_git
 * @description: 序列化、反序列化破坏单例模式的解决方法
 * 在类中添加readResolve方法，在反序列化时被反射调用 如果定义了这个方法
 * 就返回这个方法的值 如果没有 new新的对象
 * @author:
 * @create: 2021-12-15 15:08
 **/
public class Demo01 {

    private Demo01() {}
    private static class Demo01Holder {
        private static final Demo01 INSTANCE = new Demo01();
    }

    public static Demo01 getInstance() {
        return Demo01Holder.INSTANCE;
    }

    /**
     * 当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
     * @return
     */
    public Object readResolve() {
        return Demo01Holder.INSTANCE;
    }
}
