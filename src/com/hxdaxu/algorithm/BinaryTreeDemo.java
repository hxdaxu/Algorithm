package com.hxdaxu.algorithm;

public class BinaryTreeDemo {

    public static void main(String[] args) {
        /*
         * 定义一个二叉树 ------------------------------------------------------------------------------------------------------------ begin
         */
        BiTNode nodes [] = new BiTNode[30];
    	for (int i = 0; i < nodes.length; i++) {
    	   nodes[i] = new BiTNode(i+"",null,null);
    	}
    	
    	int m = 0;
    	int n = m + 1;
    	while(true){
//    	    System.out.println("log n = "+n);
            nodes[m].lChild = nodes[n++];
            if (n == nodes.length -1) break;
            nodes[m].rChild = nodes[n++];
            if (n == nodes.length -1) break;
            m++;
    	}
        /*
         * 定义一个二叉树 ------------------------------------------------------------------------------------------------------------ end
         */
    	
    	// 先序遍历二叉树
//    	preOrderTraverse(nodes[0]);
    	
    	// 中根遍历
    	inOrderTraverse(nodes[0]);
    	
    	// 最大深度
    	int maxDepth = maxDepth(nodes[0]);
    	System.out.println("max depth = " + maxDepth);
    	
    	// 最小深度
    	int minDepth = minDepth(nodes[1]);
    	System.out.println("min depth = " + minDepth);
    }
    	

    /**
     * 给定一个二叉树，计算该二叉树的最大深度 最大深度为根节点到最远叶子节点的距离
     *  如果二叉树为空，深度为0。根节点的深度为1
     */
    public static int maxDepth (BiTNode root){
        if (root == null) {
            return 0;
        } else {
            // +1 表示的是root的深度
            int left = 1 + maxDepth(root.lChild);
            int reght = 1 + maxDepth(root.rChild);
            return Math.max(left, reght);
        }
    }
    
    /**
     * 给定一个二叉树，计算该二叉树的最小深度 最小深度为根节点到最近叶子节点的距离
     */
    public static int minDepth (BiTNode root){
        if (root == null) {
            return 0;
        } else {
            if (root.lChild == null) return minDepth(root.rChild) + 1;
            if (root.rChild == null) return minDepth(root.lChild) + 1;
            
            return Math.min(minDepth(root.lChild), minDepth(root.rChild)) + 1;
        }
    }
    
    /**
     * 先序遍历二叉树
     */
    public static void preOrderTraverse(BiTNode root) {
        if (root == null) {
            return;
        } else {
            root.visit();
            preOrderTraverse(root.lChild);
            preOrderTraverse(root.rChild);
        }
    }
    
    /**
     * 中根遍历
     */
    public static void inOrderTraverse(BiTNode root){
        if (root == null) {
            return;
        } else {
            inOrderTraverse(root.lChild);
            root.visit();
            inOrderTraverse(root.rChild);
        }
    }
    
    /**
     * 后根遍历
     */
    public static void postOrderTraverse(BiTNode root){
        if (root == null) {
            return;
        } else {
            postOrderTraverse(root.lChild);
            postOrderTraverse(root.rChild);
            root.visit();
        }
    }
    
    
}

/**
 * 定义二叉树节点
 */
class BiTNode {
    String data;
    BiTNode lChild;
    BiTNode rChild;
    private boolean isVisited;

    BiTNode(String data, BiTNode left, BiTNode right) {
        this.data = data;
        this.lChild = left;
        this.rChild = right;
    }

    public void visit() {
        this.isVisited = true;
        System.out.println(data);
    }

    public boolean isVisited() {
        return this.isVisited;
    }
}


