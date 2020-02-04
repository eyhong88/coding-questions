package com.eyhong.code.trees;

import com.eyhong.code.trees.easy.MaxDepthBinaryTree;
import com.eyhong.code.trees.easy.MergeTwoBinaryTrees;

public class TreeMain {

    public static void main(String[] args) {

        MergeTwoBinaryTrees s = new MergeTwoBinaryTrees();
        MergeTwoBinaryTrees.TreeNode treeNode = new MergeTwoBinaryTrees.TreeNode(1);
        treeNode.left = new MergeTwoBinaryTrees.TreeNode(3);
        treeNode.right = new MergeTwoBinaryTrees.TreeNode(2);
        treeNode.left.left = new MergeTwoBinaryTrees.TreeNode(5);

//        MergeTwoBinaryTrees.TreeNode treeNode2 = new MergeTwoBinaryTrees.TreeNode(2);
//        treeNode2.left = new MergeTwoBinaryTrees.TreeNode(1);
//        treeNode2.left.right = new MergeTwoBinaryTrees.TreeNode(4);
//        treeNode2.right = new MergeTwoBinaryTrees.TreeNode(3);
//        treeNode2.right.right = new MergeTwoBinaryTrees.TreeNode(7);

//        s.mergeTrees(treeNode, treeNode2);

        MaxDepthBinaryTree max = new MaxDepthBinaryTree();
        MaxDepthBinaryTree.TreeNode maxNode = new MaxDepthBinaryTree.TreeNode(1);
        maxNode.left = new MaxDepthBinaryTree.TreeNode(3);
        maxNode.right = new MaxDepthBinaryTree.TreeNode(2);
        maxNode.right.right = new MaxDepthBinaryTree.TreeNode(2);
        maxNode.right.right.right = new MaxDepthBinaryTree.TreeNode(2);
        maxNode.left.left = new MaxDepthBinaryTree.TreeNode(5);

        System.out.println(max.maxDepth(maxNode));

    }
}
