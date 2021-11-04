package top.yy.sleep和wait的区别.sleep;


/**
 * sleep和wait方法区别
 * wait方法属于Object类 sleep方法是Thread类
 */

/**
 * sleep是静态方法
 * 让调用线程进入睡眠状态 因为是静态方法 所以不能改变调用对象的机锁
 * 线程休眠 但是机锁没有释放 其他线程无法访问这个对象
 *
 * 下方测试代码
 * 输出为
 * 此方法线程休眠3秒 1636007234562
 * 21:11:04 14:27:14.585
 * 结束时间 1636007237600
 * 21:11:04 14:27:17.600
 *
 * Process finished with exit code 0
 *
 * 在这个例子中就是sleepThread线程拿到了service对象的同步锁，进入后休眠，但没有释放机锁，
 * 那么waitThread线程是不能执行这个service对象的其他同步代码块的，也就就是不能进入这一段代码
 *
 *
 * 重要的一句话
 * 每个对象都有一把锁 sleep是不会去释放这把锁的
 */
public class Demo01 {

    public static void main(String[] args) {
        Service service = new Service();
        Thread serviceWaitThread = new Thread(new ServiceWaitThread(service));
        Thread serviceSleepThread = new Thread(new ServiceSleepThread(service));
        serviceWaitThread.start();
        serviceSleepThread.start();

    }
}
