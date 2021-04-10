package com.yy.staticexamples;

public class B {

    {
        System.out.println("非static域");
    }

    static {
        System.out.println("static域");
    }

    public B(){
        System.out.println("B 无参构造");
    }
}
