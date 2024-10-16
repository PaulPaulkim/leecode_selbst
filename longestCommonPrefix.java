package leetcode_easy;

import java.util.Arrays;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 * */

public class longestCommonPrefix {

	public static String longestprefix(String[] strs) {
		
		Arrays.sort(strs);
		String s1 = strs[0];
		String s2 = strs[strs.length-1];
		int idx = 0;
		
		while(idx < s1.length() && idx < s2.length()) {
			if(s1.charAt(idx) == s2.charAt(idx)) {
				idx++;
			}else {
				break;
			}
		}
		return s1.substring(0, idx);
		
		
	}
	
	public static void main(String[] args) {
		String[] strs = {"aaa","aa","aaa"};
		System.out.println(longestprefix(strs));

	}

}
