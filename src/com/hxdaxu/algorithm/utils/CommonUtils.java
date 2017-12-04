package com.hxdaxu.algorithm.utils;

import java.util.List;
import java.util.LinkedList;

public class CommonUtils {
	
	/**
	 * 将list转换为LinkedList
	 * @param list
	 * @return
	 */
	public static <T> LinkedList<T> toLinkedList(List<T> list){
		LinkedList<T> linkedList = new LinkedList<T>();
		
		for(T t : list) {
			linkedList.add(t);
		}
		
		return linkedList;
	}

	/**
	 * 遍历整型数组
	 * @param arrays
	 */
	public static void traverseArray(int arrays[]) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i]+" ");
		}
		// 换行
		System.out.println("");
	}
	
	
}
