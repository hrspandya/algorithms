package _0_5_longgest_palindrome;

public class Solution_1 {

	public static void main(String[] args) {
		System.out.println("Input : caba     Output: " + longestPalindrome("caba"));
	}
	
	public static String longestPalindrome(String s) {
        int currentLength = 0;
        String result = "";
        
        if(s.length() < 2){
            return s;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(isPalindrome(s, i - currentLength - 1, i)){
                result = s.substring(i - currentLength - 1, i + 1);
                currentLength = currentLength + 2;
            }else if(isPalindrome(s, i - currentLength, i)){
                result = s.substring(i - currentLength, i + 1);
                currentLength = currentLength + 1;
            }
        }
        
        return result;
    }
    
    public static boolean isPalindrome(String s, int start, int end){
        if(start < 0){
            return false;
        }
        
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                //continue
                start++;
                end--;
            }else{
                return false;
            }
        }
        
        return true;
    }
	
}
