package _7_76_min_window_substring;

import java.util.ArrayList;

public class Solution_1 {
	/*
	 * Given a string S and a string T, find the minimum window in S which will
	 * contain all the characters in T in complexity O(n).
	 * 
	 * For example, S = "ADOBECODEBANC" T = "ABC" Minimum window is "BANC".
	 * 
	 * Note: If there is no such window in S that covers all characters in T,
	 * return the empty string "".
	 * 
	 * If there are multiple such windows, you are guaranteed that there will
	 * always be only one unique minimum window in S.
	 * 
	 * 
	 * Solution: loop through s and see if it exist in t, if so remove it, when list is empty means we found the string
	 * , start again 
	 */
	public static void main(String[] args) {
		System.out.println(minWindow("AB", "A"));
		System.out.println(minWindow("A", "A"));
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
	}

	public static String minWindow(String s, String t) {
		 if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
				return "";
			}

			if (t.length() > s.length()) {
				return "";
			}

			ArrayList<Character> arrList = new ArrayList<>();
			for (int i = 0; i < t.length(); i++) {
				arrList.add(t.charAt(i));
			}

			ArrayList<Character> list = new ArrayList<>(arrList);

			int start = -1;
			int end = 0;
			int rStart = -1;
			int rEnd = -1;

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				int index = list.indexOf(c);
				if (list.indexOf(c) >= 0) {
					list.remove(index);
					if (start == -1) {
						start = j;
						end = (end < start) ? start : end;
					} else {
						end = j;
					}
				}

				if (list.isEmpty()) {				
					list = new ArrayList<>(arrList);
					if (rStart != -1 && rEnd != -1) {
						if (rEnd - rStart < end - start) {
							// do nothing
						} else {
							// replace result
							rStart = start;
							rEnd = end;
						}
					} else {
						rStart = start;
						rEnd = end;
					}
					
					start = -1;
				}
			}

			StringBuffer sb = new StringBuffer();

			if(rStart != -1 && rEnd != -1){
				for (int k = rStart; k <= rEnd; k++) {
					sb.append(s.charAt(k));
				}
			}		

			return sb.toString();
	}
}
