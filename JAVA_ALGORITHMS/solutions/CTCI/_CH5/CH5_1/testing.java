package _CH5.CH5_1;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setBit(10, 1));
		
		//System.out.println(getBit(4, 1));
	}
	
	
	public static boolean getBit(int num, int i) { 
		return ((num & (1 << i)) != 0); 
	}
	
	public static int setBit(int num, int i) { 
		return num | (1 << i); 
	}
	 	
	 


}
