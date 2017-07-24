package com.leetcode.demos;

public class BinaryTreeDemo {

    public static void main(String[] args) {
    	
// Given a binary tree, find its maximum depth.
// The maximum depth is the number of nodes along the longest path 
// from the root node down to the farthest leaf node.

//    	TreeNode 
    	
    	TreeNode tree [] = new TreeNode[10];
    	
    	for (int i = 0; i < 10; i++) {
    		
			TreeNode node = new TreeNode('a');
			tree [i] = node;
			if (i < 1) {
				continue;
			}
			
			if (i % 2 == 1) {
				tree [i-1].left = tree[i];
			} 
		}
    	
    }
    
    static class TreeNode {
    	char val;
    	TreeNode left;
    	TreeNode right;
    	
    	TreeNode(int _val){
    		this.val = val;
    	}
    }

    public static int getMaxDepth(TreeNode root){
    	if (root == null) {
			return 0;
		} else {
			int left = getMaxDepth(root.left);
			int right = getMaxDepth(root.right);
			
			return 1 + Math.max(left, right);
		}
    }
    
}
