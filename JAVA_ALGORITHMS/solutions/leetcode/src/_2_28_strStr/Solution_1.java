package _2_28_strStr;

public class Solution_1 {
	/*
	 * Implement strStr(). Implement Indexof , string search
		Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.			
	 */
	
	public static void main(String[] args) {
		System.out.println(strStr("", ""));
		System.out.println(strStr("hello world", "lo"));
		System.out.println(strStr("aaa", "a"));
	}
	
	
	public static int strStr(String haystack, String needle) {
        if(haystack != null && needle != null){
            if(haystack == needle){
                return 0;
            }
            
            if(needle.length() == 0){
                return -1;
            }
            
            if(haystack.length() >= needle.length()){
                
                for(int i = 0; i < haystack.length(); i++){
                    char c = haystack.charAt(i);
                    if(c == needle.charAt(0)){
                        int h = i;
                        int n = 0;
                        
                        while(h < haystack.length()){    
                            
                            if(n >= needle.length()){
                                return i; //found the needle
                            }
                            
                            if(haystack.charAt(h) == needle.charAt(n)){
                                h++;
                                n++;
                            }else{
                            	break;
                            }
                        }
                    
                    }else{
                        //nothing go to the next one
                    }
                }
                
                return -1;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
	
}
