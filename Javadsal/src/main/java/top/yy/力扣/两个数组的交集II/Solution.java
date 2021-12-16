package top.yy.力扣.两个数组的交集II;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
//        初始化hashmap
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
//            意思是获取这个map中是否存在这个num的key，不存在，设置默认值0，并且＋1
            int count = map.getOrDefault(num, 0) + 1;
//            下面添加这个num的key和count，这样下次存在，在这个value的基础上＋1，这样就把每个数字重复多少算进去了
            map.put(num, count);
        }
//        初始化集合
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
//            同样使用这个方法获取对应key的值
            int count = map.getOrDefault(num, 0);
//            value大于0说明存在
            if (count > 0) {
//                这时候把大于0的key加入到交集中，这是肯定存在的，后续只要把他的value减1即可
                intersection[index++] = num;
//                把nums1的hashmap中的key对应value减1
                count--;
//                如果这个时候value还存在，那么就重写添加一遍，会覆盖原始的key value
                if (count > 0) {
                    map.put(num, count);
                } else { // 如果value等于0了，那么移除这个元素
                    map.remove(num);
                }
            }
        }
//        只拿取到index的数组
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public static void main(String[] args) {
        int[] res = new Solution().intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int re : res) {
            System.out.println(re);
        }
    }
}