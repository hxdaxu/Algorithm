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

}
