package com.hxdaxu.algorithm;
/**
 * 图的遍历
 */
public class GraphDemo {

    public static void main(String[] args) {
    	int a = 3 / 0;//Arithmetic
    }

    /**
     *  Deepth first search 深度优先遍历 
     *  是二叉树先序遍历的扩展
     *  维持一个数组，保存每个结点的访问状态。
     *  从某一结点出发，访问该结点，然后选取下一个未被访问的结点，递归调用。
     *  该结点的相邻结点都被访问过，则返回，否则选取下一个未被访问的结点，递归调用。
     *  对于非连接图，选取任一结点进行以上递归调用。
     */
    public static void DFSTraverse() {}
    
    /**
     * Breadth First Search 广度优先遍历
     * 
     */
    public static void BFSTraverse() {}
    
}
