package top.yy.数据结构;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println(linkedList.toString());

        linkedList.addAll(linkedList);
        System.out.println(linkedList.toString());

        LinkedList clone = (LinkedList) linkedList.clone();
        System.out.println(clone.toString());

//        clone方法是深拷贝 不会引用同一个地址
        clone.add("e");
        System.out.println(linkedList);
        System.out.println(clone);


    }
}
