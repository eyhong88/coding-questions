package com.eyhong.code.trees.easy;

import com.eyhong.code.trees.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        return calcDepth(root);
    }

    private int calcDepth(TreeNode node) {
        if(null == node) return 0;

        int left = calcDepth(node.left);
        int right = calcDepth(node.right);
        if(left > right)
            return left + 1;
        else
            return right + 1;
    }

}
