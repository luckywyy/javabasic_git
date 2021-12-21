package top.yy.二叉树的遍历.前序遍历;

/**
 * @program: javabasic_git-top.yy.二叉树的遍历.前序遍历
 * @description: 根据LDR三个节点 二叉树的遍历有六种
 * 一般来说 分为DLR LDR LRD 三种前序遍历 中序遍历和后序遍历
 * @author:
 * @create: 2021-12-21 10:20
 **/

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println(root.val);
//        if (root == null) {
//            return null;
//        }
//        integers.add(Integer.valueOf(root.val));
        DLR(root, integers);

        return integers;
    }

    public void DLR(TreeNode node, ArrayList list) {
        if (node != null) {
            list.add(Integer.valueOf(node.val));
            DLR(node.left, list);
            DLR(node.right, list);
        }

        return;

    }

    public static void main(String[] args) {
//        构建二叉树
//        root = [1,null,2,3]

//        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        TreeNode root = new TreeNode();

        for (Integer integer : new Solution().preorderTraversal(root)) {
            System.out.println(integer);
        }

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