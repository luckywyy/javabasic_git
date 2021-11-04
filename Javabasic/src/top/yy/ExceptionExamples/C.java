package top.yy.ExceptionExamples;

import java.io.IOException;

public class C {

    public static void main(String[] args) throws ArithmeticException, IOException {



        int b = 9*0;
        int a = 10;
        try{

            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e+"下一步");
        }
    }
}
