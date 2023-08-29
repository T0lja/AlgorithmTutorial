package dev.tolja;

public class TreeNode {

    /*
     === Test Data for ArraySolution ===
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     root.right.left = new TreeNode(6);
     root.right.right = new TreeNode(7);
     */
    TreeNode left;
    TreeNode right;

    int val;

    TreeNode(int root) {
        this.val = root;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public int findDepthOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = findDepthOfTree(root.left);
        int rightDepth = findDepthOfTree(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode r = root.left;
        root.left = root.right;
        root.right = r;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }
}










