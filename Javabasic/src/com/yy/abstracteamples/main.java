package com.yy.abstracteamples;

public class main {
    public static void main(String[] args) {

        AbstractA a = new AExtends();
        a.eat();
        a.run();
        a.getName(2);
        System.out.println("-----------------");
        AExtends b = new AExtends();
        b.eat();
        b.run();
        b.getName(2);
    }

}
