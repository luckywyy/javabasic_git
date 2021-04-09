package com.yy;

import com.yy.多态例子.Person;
import com.yy.多态例子.Student;
import com.yy.多态例子.Teacher;

public class main {
    public static void main(String[] args) {

        Person ob = new Student();

        ob.carrer();
        ob.eat();

        Student ob2 = (Student) ob;
        ob2.homework();

        ob.play();
        ob2.play();


    }
}
