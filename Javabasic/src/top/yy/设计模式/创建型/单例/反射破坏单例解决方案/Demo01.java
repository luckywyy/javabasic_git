package top.yy.设计模式.创建型.单例.反射破坏单例解决方案;

/**
 * @program: javabasic_git
 * @description: 通过在构造方法中添加判断是否为none
 * @author:
 * @create: 2021-12-15 15:23
 **/
public class Demo01 {

    private static boolean flag = false;


    private Demo01() {
//        使用当前类的字节码对象建立同步代码块
        synchronized (Demo01.class) {
//        判断flag的值是否是true，如果是 说明非第一次访问 直接抛出一个异常即可
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
//        正常的话 将flag值设置为true
            flag = true;
        }

    }
    private static class Demo01Holder {
        private static final Demo01 INSTANCE = new Demo01();
    }

    public static Demo01 getInstance() {
        return Demo01Holder.INSTANCE;
    }

}
