package _5_50_pow;

public class Solution_1 {
	/*
	 * Implement pow(x, n).
	 */
	
	public static void main(String[] args) {		
		System.out.println(pow(0.00001, 2147483647));
		System.out.println(pow(2, 0));
		System.out.println(pow(2, 5));
		System.out.println(pow(2, -5));
		System.out.println(pow(5, 1));
	}
	
	public static double pow(double x, int n){
		if(n == 0){
			return 1;
		}
		
		
		double result = 1.0;
		double num = (double)x;
		
		if(n < 0){
			n = -n;
			num = ((double)1/(double)x);	//in java if you do 1/x, since 1 and x are int, it will give 0 result;
											//if you want to get 0.5 result, then both 1 and x needs to be converted to double
		}
				
		for(int i = 0; i < n; i++){
			result = result * num;
		}
		
		return result;
	}
	
}
