package com.hp.recursion.permutation;

public class Permutation {
    
    
    
    public static void main (String args[])
    {        
        permute("cat");
    }
        
    
    public static void permute( String input)
    {
        int inputLength = input.length();        
        String result = "";
        char[ ] array = input.toCharArray( );
        doPermute ( array, 0, inputLength);
        
    }
    
    public static void doPermute ( char[ ] a, int index, int strLength){
    	
    	//When i reaches to last element then print result and return
    	if(index == strLength){
    		String result = "";
    		for(int j = 0; j < a.length; j++){
    			result = result + a[j];
    		}    		
    		System.out.println(result);
    	}
    	
    	for(int i= index; i < strLength; i++){
    		//swap
//    		char t = a[index];
//    		a[index] = a[i];
//    		a[i] = t;
    		
    		doPermute(a, index + 1, strLength);
    		
    		//swap again
//    		t = a[index];
//    		a[index] = a[i];
//    		a[i] = t;
    			    		
    	}
    	    	    	
    }
    
}



