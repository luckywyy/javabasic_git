package top.yy.数据结构;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("user", "zhangsan");
        hashMap.put("age", "20");
        hashMap.put("profile", "法外狂徒");
        System.out.println(hashMap.toString());
        System.out.println(hashMap.values());
    }
}
