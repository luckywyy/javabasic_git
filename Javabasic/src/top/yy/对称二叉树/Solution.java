package top.yy.对称二叉树;

/**
 * @program: javabasic_git-top.yy.对称二叉树
 * @description:
 * @author:
 * @create: 2021-12-20 09:46
 **/

import javax.swing.tree.TreeNode;

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
    public boolean isSymmetric(TreeNode root) {
        /**
         * 递归左子树和右子树即可
         */
        boolean flag = false;
        return flag;
    }
//    public boolean check(TreeNode p, TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
//    }

    public static void main(String[] args) {
//        [1,2,2,3,4,4,3]
    }
}