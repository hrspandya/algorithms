package _1_12_integer_to_roman;

public class Solution_1 {
	
	public static void main(String[] args) {
		System.out.println("Input : 2542   Output: " + intToRoman(2542));
	}
	
	
	public static String intToRoman(int num){
		String M[] = {"", "M", "MM", "MMM"};
	    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	    
	    return M[num/1000] + C[(num % 1000)/100] + X[(num % 100)/10] + I[num % 10];
	}
}
