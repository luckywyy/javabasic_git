package top.yy.二叉树的遍历.后序遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: javabasic_git-top.yy.二叉树的遍历.后序遍历
 * @description:
 * @author:
 * @create: 2021-12-21 10:20
 **/
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        LRD(root, list);
        return list;

    }

    public void LRD(TreeNode node, ArrayList list) {
        if (node == null) {
            return;
        }
        LRD(node.left, list);
        LRD(node.right, list);
        list.add(node.val);
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