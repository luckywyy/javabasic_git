package top.yy.设计模式.创建型.解决序列化反射等破环单例模式方案;

/**
 * @program: javabasic_git
 * @description: 序列化、反序列化破坏单例模式的解决方法
 * 在类中添加readResolve方法，在反序列化时被反射调用 如果定义了这个方法
 * 就返回这个方法的值 如果没有 new新的对象
 * @author:
 * @create: 2021-12-15 15:08
 **/
public class Demo01 {
}
