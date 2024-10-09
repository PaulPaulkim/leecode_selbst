/*
 * Given an integer x, return true if x is a palindrome , and false otherwise.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 * */


package leetcode_easy;

public class isPalindrome {
	
	public static boolean Palindrome(int x) {
		if( x < 0) {
			return false;
		}else {
			String s = Integer.toString(x);
			int laenge = s.length();
			
			for( int i = 0; i< laenge/2 ; i++) {
				if(s.charAt(i) != s.charAt(laenge-1-i)) {
					return false;
				}
			}
			return true;
		}
	}
	
	
	
	public static void main(String[] args) {
		int x = 121;
		int y = -121;
		int z = 1234;
		System.out.println(Palindrome(x));
		System.out.println(Palindrome(y));
		System.out.println(Palindrome(z));
		
		}
	}


