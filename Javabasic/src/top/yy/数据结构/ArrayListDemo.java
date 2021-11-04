package top.yy.数据结构;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");

        System.out.println(arrayList.toString());

        arrayList.clear();

        ArrayList<String> al2 = (ArrayList<String>) arrayList.clone();
        al2.add("c");
        arrayList.add("d");
        System.out.println(arrayList.toString());
        System.out.println(al2.toString());
    }
}
