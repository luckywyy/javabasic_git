package top.yy.数据结构;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");

        System.out.println(arrayList.size());
//        获取容量大小
        //获取 elementData 字段
        Field field = ArrayList.class.getDeclaredField("elementData");
        //开始访问权限
        field.setAccessible(true);
        //把示例传入get，获取实例字段elementData的值
        Object[] objects = (Object[])field.get(arrayList);
        //返回当前ArrayList实例的容量值
        System.out.println(objects.length);

//        System.out.println(arrayList.toString());
//
//        arrayList.clear();
//
//        ArrayList<String> al2 = (ArrayList<String>) arrayList.clone();
//        al2.add("c");
//        arrayList.add("d");
//        System.out.println(arrayList.toString());
//        System.out.println(al2.toString());
    }
}
