package top.yy.力扣.二叉树的最大深度;

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
//    解法1 广度优先 有多少层有多深
    public int maxDepth1(TreeNode root) {
        return 0;
    }
//    解法2 深度优先 走遍每一条路径
    int depth = 0;
//    int depth = Integer.MIN_VALUE;
    public int maxDepth2(TreeNode root) {

        DLR(root, 0);

        return depth;
    }
    public void DLR(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        depth += 1;
        if (depth > this.depth) {
            this.depth = depth;
        }
        DLR(node.left, depth);
        DLR(node.right, depth);
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