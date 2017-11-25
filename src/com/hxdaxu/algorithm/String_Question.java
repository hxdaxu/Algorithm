package com.hxdaxu.algorithm;

import java.util.HashMap;

public class String_Question {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring("abcdeedcbaaabckiebdhjdhalnvkjashdfiosndjklgsanflawebfgxjkdgnakljsdhfdfbaseuoifnsdjbfafsefsdfasdgfvsdfg"));
	}
	
	
	/**
	 * Longest Substring Without Repeating Characters 
	 * Given a string, find the length of the longest substring without repeating characters.
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring(String s) {
		
		int ans = 0,n = s.length();
		
		HashMap<Character,Integer> map = new HashMap();
		
		// 最佳滑动窗口解法。
		// 维护一个窗口范围[i,j],当j递增，遇到与窗口范围内重复的字符（下标为j`），令i = max（i，j`）
		// i = max（i，j`）这里要取max的原因为，窗口左边界（i）不允许向后滑动。当字符为“abba”这种时，会出现这种情况。
		
		for(int j=0,i=0;j<n;j++) {
			
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(i, map.get(s.charAt(j))+1);
			}
			
			// 记录窗口大小，取最大值
			ans = Math.max(ans, j-i+1);
			// 窗口右边界滑动
			map.put(s.charAt(j), j);
		}
		
		return ans;
	}

}
