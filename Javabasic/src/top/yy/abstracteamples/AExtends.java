package top.yy.abstracteamples;

public class AExtends extends AbstractA{
    public AExtends(){
        System.out.println("继承类的无参构造");
    }
    @Override
    public void run() {
        System.out.println("继承类重写的run 方法");
    }
}
