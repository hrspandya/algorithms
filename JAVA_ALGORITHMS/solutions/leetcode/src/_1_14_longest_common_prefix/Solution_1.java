package _1_14_longest_common_prefix;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"stest1", "stea1", "stell1"}));
	}
	
	public static String longestCommonPrefix(String[] strs) {
	    if(strs == null || strs.length == 0)    return "";
	    String pre = strs[0];
	    int i = 1;
	    while(i < strs.length){
	        while(strs[i].indexOf(pre) != 0)
	            pre = pre.substring(0,pre.length()-1);
	        i++;
	    }
	    return pre;
	}
}
