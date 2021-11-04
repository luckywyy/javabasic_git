package top.yy.ExceptionExamples;

public class A {

    public static void main(String[] args) {

        try {
            A a = new A();
            a.getThree(3);
        }
        catch (Error e){
            System.out.println("出现错误，下一步");
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }
    }

    public int getOne(int a){
        return getTwo(a);
    }

    public int getTwo(int b){
        return getOne(b);
    }

    public int getThree(int c){
        return getThree(c+1);
    }
}
