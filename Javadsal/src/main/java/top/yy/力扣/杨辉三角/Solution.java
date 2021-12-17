package top.yy.力扣.杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: javabasic_git
 * @description:
 * @author:
 * @create: 2021-12-17 09:07
 **/
public class Solution {
    public List<List<Integer>> generate(int numRows) {
//        创建最外层的数组
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
//        循环层数
        for (int i = 0; i < numRows; ++i) {
//            创建每一层 因为第几层就有第几个数
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
//                每一层最左边和最右边都是1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
//                    每一层其他位置只跟上左和上有关
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
