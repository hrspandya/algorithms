package _CH5.CH5_2;

public class Solution_1 {
	
	/*
	 * Question:Given a real number between 0 and 7 (e.g., 0.72) that is passed in as a double, 
	 * print the binary representation. If the number cannot be represented accurately in binary with at most 32 characters, 
	 * print "ERROR."
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(printBinary(.125));
		System.out.println(printBinary(.375));
		System.out.println(printBinary(.625));
		System.out.println(printBinary(.875));		
				
	}
	
	
	public static String printBinary(double num){
		StringBuffer result = new StringBuffer();
		
		if(num >= 1 || num <= 0){
			return "ERROR";
		}
		
		result.append(".");
		
		while(num > 0){
			
			if(result.length() > 32){
				return "ERROR";
			}
			
			double r = num * 2;
			
			if(r >= 1){
				result.append("1");
				num = r - 1;
			}else{
				result.append("0");
				num = r;				
			}
						
		}	
		
		return result.toString();
	}

}
