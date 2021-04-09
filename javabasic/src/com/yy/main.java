package com.yy;

import com.yy.多态例子.Person;
import com.yy.多态例子.Student;
import com.yy.多态例子.Teacher;

public class main {
    public static void main(String[] args) {

        System.out.println("main");

        Student ob = new Student();

        System.out.println(ob instanceof Object);
        System.out.println(ob instanceof Person);
        System.out.println(ob instanceof Student);
//        System.out.println(ob instanceof Teacher);
//        System.out.println(ob instanceof String);

    }
}
