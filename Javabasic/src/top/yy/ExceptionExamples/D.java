package top.yy.ExceptionExamples;

public class D {

    public void dmethod() throws CustomException{

        System.out.println("这是D类的方法，此方法会抛出异常");
        throw new CustomException("自定义异常");
    }
}
