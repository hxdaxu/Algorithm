package com.hxdaxu.algorithm;

import java.util.Arrays;
import java.util.LinkedList;

import com.hxdaxu.algorithm.utils.CommonUtils;

public class Linear_List {

	public static void main(String[] args) {
//		
//		String a[] = {"a","b","c","d","e","f"};
//		String b[] = {"d","e","f","g","h","i"};
//		
//		LinkedList<String> listA = (LinkedList<String>)Arrays.asList(a); 
//		LinkedList<String> listB = (LinkedList<String>)Arrays.asList(b);
//		
//		union(listA,listB);
		
		Integer c[] = {2,2,3,5,7};
		Integer d[] = {4,5,8,9,11,13,67};
		
		LinkedList<Integer> listC = CommonUtils.toLinkedList(Arrays.asList(c)); 
		LinkedList<Integer> listD = CommonUtils.toLinkedList(Arrays.asList(d));
		
		mergeList(listC, listD);
	}
	/*
	 * 返回线性表c，c为a，b的合集。
	 */
	public static LinkedList<String> union(LinkedList<String> listA,LinkedList<String> listB){
		LinkedList<String> listC = new LinkedList<String>();
		listC.addAll(listA);
		
		int lengthB = listB.size();
		for(int i = 0;i < lengthB;i++){
			String t = listB.get(i);
			
			if(!listA.contains(listB.get(i))){
				listC.add(t);
			}
		}
		
		return listC;
	}
	
	/**
	 * 线性表LA和LB中的数据元素按值非递减有序排列，现要求将LA和LB归并为一个新的线性表LC，
	 * 且LC中的数据元素仍按值非递减有序排列。
	 * @param listA
	 * @param listB
	 */
	public static LinkedList<Integer> mergeList(LinkedList<Integer> listA,LinkedList<Integer> listB){
		LinkedList<Integer> lC = new LinkedList<Integer>();
		int lA_len = listA.size();
		int lB_len = listB.size();
		int i =0,j =0,c =0;
		while(i < lA_len && j <lB_len){
			if (listA.get(i) <= listB.get(j)){
				lC.add(listA.get(i));
				i++;
			} else {
				lC.add(listB.get(j));
				j++;
			}
		}

		for(;i < lA_len;i++){
			lC.add(listA.get(i));
		}
		
		for(;j < lB_len;j++){
			lC.add(listB.get(j));
		}
		
		while (!lC.isEmpty()){
			System.out.print(lC.remove()+" ");
		}
		
		return lC;
	}
	
	/**
	 * 使用java api，更简单
	 * @param listA
	 * @param listB
	 * @return
	 */
	public static LinkedList<Integer> mergeList2(LinkedList<Integer> listA,LinkedList<Integer> listB){
		LinkedList<Integer> lC = new LinkedList<Integer>();
		
		while(!listA.isEmpty() && !listB.isEmpty()){
			if (listA.getFirst() <= listB.getFirst()){
				lC.add(listA.remove());
			} else {
				lC.add(listB.remove());
			}
		}
		
		if (!listA.isEmpty()){
			lC.addAll(listA);
		}
		
		if (!listB.isEmpty()){
			lC.addAll(listB);
		}
		
		while (!lC.isEmpty()){
			System.out.print(lC.remove()+" ");
		}
		
		return lC;
	}
	
	
	
	
	
}
