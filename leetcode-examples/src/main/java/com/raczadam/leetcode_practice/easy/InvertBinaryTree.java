package com.raczadam.leetcode_practice.easy;

import com.raczadam.leetcode_practice.utility.structure.TreeNode;

// https://leetcode.com/problems/invert-binary-tree/description/
public class InvertBinaryTree {


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }


}
