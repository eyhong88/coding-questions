package com.eyhong.code.tree;

import com.eyhong.code.tree.easy.MaxDepthBinaryTree;
import com.eyhong.code.tree.easy.MergeTwoBinaryTrees;
import com.eyhong.code.tree.easy.MinDepthBinaryTree;
import com.eyhong.code.tree.medium.LevelOrderBinaryTree;

public class TreeMain {

    public static void main(String[] args) {

//        mergeTwoBinaryTrees();
//        maxDepthBinaryTree();
//        minDepthBinaryTree();
        levelOrderBinaryTree();
    }

    private static void levelOrderBinaryTree() {
        LevelOrderBinaryTree levelOrderTree = new LevelOrderBinaryTree();
        TreeNode levelNode = new TreeNode(3);
        levelNode.left = new TreeNode(9);
        levelNode.right = new TreeNode(20);
//        levelNode.right.right = new TreeNode(7);
//        levelNode.right.left = new TreeNode(15);

        System.out.println(levelOrderTree.levelOrder(levelNode));
    }

    private static void minDepthBinaryTree() {
        TreeNode minNode = new TreeNode(1);
        minNode.left = new TreeNode(2);
        minNode.left.left = new TreeNode(3);
//        minNode.left.left.left = new TreeNode(4);
//        minNode.left.left.left.right = new TreeNode(4);
        minNode.left.right = new TreeNode(4);
//        minNode.right = new TreeNode(2);
//        minNode.right.right = new TreeNode(3);
//        minNode.right.right.right = new TreeNode(4);
//        minNode.right.right.right.left = new TreeNode(4);

        MinDepthBinaryTree min = new MinDepthBinaryTree();

        System.out.println(min.minDepth(minNode));
    }

    private static void maxDepthBinaryTree() {
        MaxDepthBinaryTree max = new MaxDepthBinaryTree();
        TreeNode maxNode = new TreeNode(1);
        maxNode.left = new TreeNode(3);
        maxNode.right = new TreeNode(2);
        maxNode.right.right = new TreeNode(2);
        maxNode.right.right.right = new TreeNode(2);
        maxNode.left.left = new TreeNode(5);

        System.out.println(max.maxDepth(maxNode));
    }

    private static void mergeTwoBinaryTrees() {
        MergeTwoBinaryTrees s = new MergeTwoBinaryTrees();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(5);

        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        treeNode2.left.right = new TreeNode(4);
        treeNode2.right = new TreeNode(3);
        treeNode2.right.right = new TreeNode(7);

        s.mergeTrees(treeNode, treeNode2);
    }
}
