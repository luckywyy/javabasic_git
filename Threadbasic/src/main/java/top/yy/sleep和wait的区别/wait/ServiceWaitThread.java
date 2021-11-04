package top.yy.sleep和wait的区别.wait;


public class ServiceWaitThread implements Runnable{

    private Service service;

    public ServiceWaitThread(Service service) {
        this.service = service;
    }

    public void run() {
        service.mwait();
    }
}
