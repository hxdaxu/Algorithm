package com.hxdaxu.algorithm;

import java.util.Stack;

public class StackStructure {

	static String ops [] = {"5","-2","4","C","D","9","+","+"};
	
	public static void main(String[] args) {
		
//		conversion(9,8);
		System.out.println(calPoints(ops));
	}
	
	/**
	 * 数制转换
	 * @param n 十进制非负数整数
	 * @param Q 进制
	 * @return 
	 */
	static String conversion(int n,int Q){
		Stack<Integer> stack = new Stack<Integer>();
		
		while(n != 0) {
			stack.push(n%Q);
			n = n/Q;
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	/**
	 * BaseBall game.
	 * @param ops
	 * @return
	 */
	public static int calPoints(String[] ops) {
		int sum = 0;
		Stack<String> s = new Stack<String>();
		
		int length = ops.length;
		for(int i=0;i<length;i++) {
			String v = ops[i];
			switch(v) {
			case "+":
				s.push(addTwo(s));
				break;
			case "D":
				s.push(timesLast(s));
				break;
			case "C":
				if (!s.isEmpty()) {
					s.pop();
				}
				break;
			default :// default Integer;
				s.push(v);
				break;
			}
		}
		
		while(!s.isEmpty()) {
			sum += Integer.valueOf(s.pop());
		}
		
		return sum;
	}
	
	private static String addTwo(Stack<String> s) {
		int sum = 0;
		for(int i = 0;i<2;i++) {
			if (!s.isEmpty()) {
				sum +=Integer.valueOf(s.pop());
			}
		}
		return ""+sum;
	}
	private static String timesLast(Stack<String> s) {
		int sum = 0;
		if (!s.isEmpty()) {
			sum = Integer.valueOf(s.pop());
		}
		
		return ""+sum;
	}
	
}
