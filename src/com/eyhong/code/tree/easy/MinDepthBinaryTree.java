package com.eyhong.code.tree.easy;

import com.eyhong.code.tree.TreeNode;

public class MinDepthBinaryTree {
    public int minDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        if(null != root) {
            left = findMin(root.left) + 1;
            right = findMin(root.right) + 1;
        }
        if(left == 1 || right == 1)
            return Math.max(left, right);
        return Math.min(left, right);
    }

    public int findMin(TreeNode t1){

        if(null == t1)
            return 0;

        int left = findMin(t1.left) + 1;
        int right = findMin(t1.right) + 1;

        // If you get to the end, it will return 1, and then 1 will always be the min.
        if(left == 1 || right == 1)
            return Math.max(left, right);
        return Math.min(left,right);
    }
}
