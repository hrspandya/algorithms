package _0_9_isPalindrome_integer;

public class Solution_1 {
	
	public static void main(String[] args) {
		
		System.out.println("Input : -2147447412  Output: " + isPalindrome(-2147447412));
		System.out.println("Input : 1  Output: " + isPalindrome(1));
		System.out.println("Input : -2147483648  Output: " + isPalindrome(-2147483648));
		System.out.println("Input : -121  Output: " + isPalindrome(-121));
		
	}
	
	
	public static boolean isPalindrome(int x) {
        //just reverse the integer and check if both x and reverseInteger are same
        int result = 0;
        int originalInput = x;
        
        while(x != 0){
            int tail = x % 10;
            int newResult = result * 10 + tail;
            //checking for overflow
            //when overflow happens result will not be same and it will be unpredicted value
            if(result != (newResult - tail)/10){
                return false;
            }
            result = newResult;
            x = x / 10;   
        }
        
        if(originalInput == result){
            return true;
        }
        
        return false;
    }
}
