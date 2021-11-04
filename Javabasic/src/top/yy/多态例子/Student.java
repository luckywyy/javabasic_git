package top.yy.多态例子;

public class Student extends Person{

    public String name = "xiaoming";

    @Override
    public void eat() {
        System.out.println("小明走读，在家里吃饭");
    }

    public void homework(){
        System.out.println("小明是学生，要写家庭作业");
    }

    public static void play(){
        System.out.println("小明娱乐活动是看书");
    }
}
