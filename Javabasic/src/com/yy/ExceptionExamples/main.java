package com.yy.ExceptionExamples;

public class main {

    public static void main(String[] args) {

        try{
            D d = new D();
            d.dmethod();
        }
        catch (CustomException e){
            System.out.println(e);
        }
    }
}
