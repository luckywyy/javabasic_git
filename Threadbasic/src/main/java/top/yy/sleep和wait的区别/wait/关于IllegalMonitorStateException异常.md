当前的线程不是此对象监视器的所有者。
当前线程要锁定该对象之后，才能用锁定的对象执行这些方法，
这里需要用到synchronized关键字，
锁定哪个对象就用哪个对象来执行notify(), notifyAll(),wait(), wait(long), wait(long, int)操作，
否则就会报IllegalMonitorStateException异常。

在Demo03中
