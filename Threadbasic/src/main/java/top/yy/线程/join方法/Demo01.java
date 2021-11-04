package top.yy.线程.join方法;

public class Demo01 {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread 1 " + Integer.valueOf(i).toString());
            }
        }, "thread-1 ");


//        thread1.start();
//        thread1.join();//        情况二

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread 2 " + Integer.valueOf(i).toString());
            }
        }, "thread-2 ");
        /**
         * 情况一
         * 首先这里join要加在start后面
         * 这里加在start后面
         * 那么主线程会被thread 2阻塞 所以会等待他执行完再执行
         * 加在前面是没用的
         *
         * 情况二
         * 所以如果这个thread 2不加join 给前面thread 1加join
         * 那么结果应该是前面会执行完
         * 然后 thread2 和 主线程交替执行 结果跟想的一样
         *
         * 情况三
         * 如果两个都start 然后再join呢
         * 结果应该是 无序的 但主线程会最后执行 因为在join之前 他们已经启动了 结果跟想的一样
         * 就算是交换两个join结果也一样
         *
         */
//        thread2.start();
//        thread2.join(); //情况一

//        情况三
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();

//        这个放前面 那么永远是先执行
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main - " + Integer.valueOf(i).toString());
        }
    }
}
