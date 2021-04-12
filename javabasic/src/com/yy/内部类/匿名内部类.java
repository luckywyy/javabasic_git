package com.yy.内部类;

public class 匿名内部类 {
    public static void main(String[] args) {

    }

    String getName(int id){

        String name = new 匿名内部类Interface(){
            @Override
            public String getName(int id) {
                return null;
            }
        }.getName(id);

        return name;
    }
}
