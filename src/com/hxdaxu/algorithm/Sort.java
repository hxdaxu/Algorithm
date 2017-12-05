package com.hxdaxu.algorithm;

import com.hxdaxu.algorithm.utils.CommonUtils;

public class Sort {
	
	static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {6,24,85,63,21,2,54,78,5,46,9,32,15,47,85,365,86,6,987,4,5,24};
		int [] array2 = {1,2,3,4,5,6,7,8,9,12,11,10,13,14,15,16,17,18,19,20};
		
		quickSort(array);
		CommonUtils.traverseArray(array);
	}
	
	/**
	 * 冒泡排序
	 * 时间复杂度为O（n2）,空间复杂度为O(1)
	 */
	public static int[] bubbleSort(int[] array){
		
		boolean change = true;
		for (int i = array.length-1; i >= 1 && change; --i) {
			change = false;
			
			for (int j = 0; j < i; ++j) {
				if (array[j] > array[j+1]) {
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
					change = true;
				}
			}
		}
		return array;
	}
	
	// 从平均时间性能而言，快速排序最佳。但快速排序在最坏情况下的时间性能不如堆排序和归并排序。
	// 
	
	/**
	 * 快速排序，是对冒泡排序的改进。
	 * 平均时间复杂度为O(nlog n),最坏情况下为O(n2)
	 */
	public static int partition(int []array,int low,int hight){
		int pivot = array[low];
		while(low < hight) {
			while (low < hight && array[hight] >= pivot) hight--;
			array[low] = array[hight];
			while (low < hight && array[low] <= pivot) low++;
			array[hight] = array[low];
		}
		array[low] = pivot;
		return low;
	}
	
	public static void QSort(int []array,int low,int hight) {
		if (low < hight) {
			int pivotIndex = partition(array, low, hight);
			QSort(array, low, pivotIndex-1);
			QSort(array, pivotIndex+1, hight);
		}
	}
	
	public static void quickSort(int []array) {
		QSort(array,0,array.length-1);
	}
	
	

}
