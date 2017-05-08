package _1_17_combinations_phone_number;

import java.util.LinkedList;
import java.util.List;

public class Solution_1 {

	public static void main(String[] args) {
		System.out.println("Input : \"23\"  Output:" + letterCombinations("234"));
	}


	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
	public static List<String> letterCombinations(String digits) {
		List<String> ret = new LinkedList<String>();
		combination("", digits, 0, ret);
		return ret;
	}

	private static void combination(String prefix, String digits, int offset, List<String> ret) {
		if (offset >= digits.length()) {
			ret.add(prefix);
			return;
		}
		String letters = KEYS[(digits.charAt(offset) - '0')];
		for (int i = 0; i < letters.length(); i++) {
			combination(prefix + letters.charAt(i), digits, offset + 1, ret);
		}
	}
	
}
