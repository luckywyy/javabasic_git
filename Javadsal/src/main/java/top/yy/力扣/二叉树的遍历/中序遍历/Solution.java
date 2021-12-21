package top.yy.力扣.二叉树的遍历.中序遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: javabasic_git-top.yy.力扣.二叉树的遍历.中序遍历
 * @description:
 * @author:
 * @create: 2021-12-21 10:20
 **/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        LDR(root, list);
        return list;

    }

    public void LDR(TreeNode node, ArrayList list) {
        if (node == null) {
            return;
        }
        LDR(node.left, list);
        list.add(node.val);
        LDR(node.right, list);
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