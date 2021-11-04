package top.yy.数据结构;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("c");
        System.out.println(hashSet.toString());
    }
}
