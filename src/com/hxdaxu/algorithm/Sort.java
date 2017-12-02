package com.hxdaxu.algorithm;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {6,24,85,63,21,2,54,78,5,46,9,32,15,47,85,365,86,6,987,4,5,24};

		System.out.println(bubbleSort(array).toString());
		
	}
	
	/**
	 * 冒泡排序
	 * 时间复杂度为O（n2）,空间复杂度为O(1)
	 */
	public static int[] bubbleSort(int[] array){
		
		for (int i = array.length-1; i >= 1; --i) {
			for (int j = 0; j < i; ++j) {
				if (array[j] > array[j+1]) {
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
				}
			}
		}
		return array;
	}
	
	
	/**
	 * 快速排序，是对冒泡排序的改进。
	 * 时间复杂度为O()
	 */
	public static void quickSort(){
		
	}

}
