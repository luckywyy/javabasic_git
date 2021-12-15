package top.yy.设计模式.创建型.单例.枚举方式;

/**
 * @program: javabasic_git
 * @description: 枚举方式是非常推荐的一种方式，因为枚举类型是线程安全的
 * 并且只会装载一次 充分利用枚举这个特性来实现单例模式，枚举的写法非常简单，而且枚举类型是所用单例
 * 实现中唯一一种不会被破坏的单例实现模式
 * @author:
 * @create: 2021-12-15 14:38
 **/
public enum Singleton {
    INSTANCE;
}
