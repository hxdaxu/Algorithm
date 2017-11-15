package com.hxdaxu.algorithm.utils;

import java.util.List;
import java.util.LinkedList;

public class CommonUtils {
	
	public static <T> LinkedList<T> toLinkedList(List<T> list){
		LinkedList<T> linkedList = new LinkedList<T>();
		
		for(T t : list) {
			linkedList.add(t);
		}
		
		return linkedList;
	}

}
