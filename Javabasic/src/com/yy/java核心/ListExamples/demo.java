package com.yy.java核心.ListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList();

        a.add(1);

        a.add(2);

//        System.out.println(a.get(a.toArray().length - 1));

        Iterator<Integer> iter = a.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }

    }
}
