package com.eyhong.code.trees.medium;

import com.eyhong.code.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class LevelOrderBinaryTree {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        s.add(root.val);
        result.add(s);
        result.add(level(root).stream().map(x -> x.val).collect(Collectors.toList()));
        return result;
    }

    public List<TreeNode> level(TreeNode t){
        if (null == t){
            return null;
        }

        Integer left = level(t.left);
        Integer right = level(t.right);

        if(null == left && null == right)
            return null;
        List<TreeNode> result = new ArrayList<>();
        if(null != left)
            result.addAll(left);
        if(null != right)
            result.addAll(right);

        return result;
    }
}
