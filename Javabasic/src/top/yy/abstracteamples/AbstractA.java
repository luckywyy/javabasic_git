package top.yy.abstracteamples;

public abstract class AbstractA {

    public AbstractA(){
        System.out.println("抽象类的无参构造");
    }

    public abstract void run();

    public void eat(){
        System.out.println("抽象类的eat方法");
    }

    public String getName(int id){
        return "张三";
    }

}
