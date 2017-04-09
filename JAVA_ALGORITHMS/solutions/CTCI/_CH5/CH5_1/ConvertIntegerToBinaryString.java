package _CH5.CH5_1;

	/*
	 * Question: Given an Integer convert it to show Binary String
	 * 
	 * Solution: get least significant bit and then remove that from number then find another LSB and remove it from num
	 * keep doing this for 32 times, assuming its 32 bit num
	 */
	

public class ConvertIntegerToBinaryString {
	
	public static void main(String[] args) {
		
		System.out.println("10  :  " + convertToBinary(10));		
		System.out.println("65  :  " + convertToBinary(65));
		System.out.println("15  :  " + convertToBinary(15));
		System.out.println("0  :  " + convertToBinary(0));
		System.out.println("1  :  " + convertToBinary(1));			
	}
	
	
	public static String convertToBinary(int num){
		
		String result = "";
		
		for(int i = 0; i < 32; i++){
			Integer lsb = new Integer(1 & num);
			result = lsb.toString() + result ;
			num = num >> 1;
		}
		
		return result.toString();
	}
	
	
	
	
}
