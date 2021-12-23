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
//            当前层的尺寸
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