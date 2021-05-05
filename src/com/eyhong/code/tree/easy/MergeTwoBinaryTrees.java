package com.eyhong.code.tree.easy;

//https://leetcode.com/problems/merge-two-binary-trees/

import com.eyhong.code.tree.TreeNode;

/**
 *
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 *
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 *
 * Example 1:
 *
 * Input:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * Output:
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 *
 *
 * Note: The merging process must start from the root nodes of both trees.
 *
 */
public class MergeTwoBinaryTrees {
    public void mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode s = calculate(t1, t2);
    }
    private TreeNode calculate(TreeNode branch1, TreeNode branch2) {
        if(null == branch1 && null == branch2) return null;
        if(null == branch1) return branch2;
        if(null == branch2) return branch1;

        TreeNode result = new TreeNode(branch1.val + branch2.val);
        result.left = calculate(branch1.left, branch2.left);
        result.right = calculate(branch1.right, branch2.right);

        return result;
    }

}
