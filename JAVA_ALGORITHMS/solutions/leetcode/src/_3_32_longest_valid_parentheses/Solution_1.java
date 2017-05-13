package _3_32_longest_valid_parentheses;

import java.util.Stack;

public class Solution_1 {

	/*
	 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

		For "(()", the longest valid parentheses substring is "()", which has length = 2.
		
		Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.

	 */
	
	
	public static void main(String[] args) {
		System.out.println("Input: ()(()    output: " + longestValidParentheses("()(()"));
	}
	
	
	public static int longestValidParentheses(String s) {
		int left = 0, 
			right = 0, 
			maxlength = 0;
		
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        
        left = right = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        
        return maxlength;
    }
	
}
