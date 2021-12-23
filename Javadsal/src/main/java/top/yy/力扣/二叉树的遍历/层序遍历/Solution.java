package top.yy.力扣.二叉树的遍历.层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
//        层序遍历，存储起来相当每个数组的一排
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
//        创建一个队列用来存储每一层
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        offer方法即插入操作
        queue.offer(root);
//        如果不是空，那么扫描这个节点的下一层所有节点
        while (!queue.isEmpty()) {
//            创建一个列表存储当前节点的值
            List<Integer> level = new ArrayList<Integer>();
//            当前层的尺寸 因为queue是动态的添加的，所以需要这个参数控制每一层的循环数量
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
//                扫描当前层的下一层节点，当前层扫描完一个队列就退出一个
                TreeNode node = queue.poll();
//                添加当前节点的值
                level.add(node.val);
//                如果左子树不为空，那么把左子树根存入
                if (node.left != null) {
                    queue.offer(node.left);
                }
//                如果右子树不为空，那么把左子树根存入
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
//            添加一层
            ret.add(level);
        }

        return ret;
    }

//    解法2

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();

        if (root == null) {
            return lists;
        }

        Queue<Object> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Queue<Object> queue2 = new LinkedList<>();
            List<Integer> list = new ArrayList<>();

//            和解法1 用size控制循环不同的是，用while把当前层队列的全拿出来，同时，在之前新建一个临时队列2
//            最后当前层队列空了，就把结果填上，并且把下一层的临时队列赋值给queue，继续循环
//            peek方法弹出队列头元素但不删除，poll方法弹出并且删除头元素，两个方法遇到队列为空时均返回null，因此用peek检查当前队列是否为空
            while (queue.peek() != null) {
                TreeNode temp_ = (TreeNode) queue.poll();
                list.add(temp_.val);
                if (temp_.left != null) {
                    queue2.add(temp_.left);
                }
                if (temp_.right != null) {
                    queue2.add(temp_.right);
                }
            }
            if (queue.isEmpty()) {
                queue = queue2;
                lists.add(list);
            }
        }


        return lists;
    }

    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}