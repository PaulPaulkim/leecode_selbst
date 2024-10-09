package leetcode_easy;

import java.util.Stack;

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 Der Frage muss mit Stack gelöscht werden.
 
 1. Stack, 	2. toCharArray  -> "Hallo"->[H,a,l,l,o]		3.for c:s.toCharArray() -> bis Ende der C wiederholen toCharArray()
 * */

public class validParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.push(')');
			}else if(c=='{') {
				stack.push('}');
			}else if(c=='[') {
				stack.push(']');
			}else if(stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		System.out.println( isValid("{()}"));
			
		

	}

}
