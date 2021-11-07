package top.yy.数据结构;


import java.util.Iterator;
import java.util.Vector;

//Vector类实现了可增长的对象数组。 像数组一样，它包含可以使用整数索引访问的组件。 但是， Vector的大小可以根据需要增大或缩小，以便在创建Vector后添加和删除项目。
public class VectorDemo {

    public static void main(String[] args) {


        Vector<String> strings = new Vector<>();
//        boolean empty1 = strings.isEmpty();
//        System.out.println(empty1);
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        System.out.println(strings.size());
        System.out.println(strings.capacity());

//        out:
//        5
//        10
//
//        Process finished with exit code 0

//        System.out.println(strings.toString());
//
////        for (String string : strings) {
////            System.out.println(string);
////        }
//
//        strings.addAll(strings);
//        System.out.println(strings);
//
//        boolean empty = strings.isEmpty();
//        System.out.println(empty);
//
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

////        可以用于函数式编程
//        strings.forEach(s -> {
//            System.out.println(s);
//        });

    }
}
