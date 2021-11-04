package top.yy.sleep和wait的区别.wait;


public class ServiceSleepThread implements Runnable{

    private Service service;

    public ServiceSleepThread(Service service) {
        this.service = service;
    }

    public void run() {
        service.msleep();
    }
}
