package _0_8_string_to_integer_atoi;

public class Solution_1 {
	
	/*
	 * String to integer (atoi)
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Input : '12a3'   Output : " + myAtoi("12a3"));
		System.out.println("Input : '-12a3'   Output : " + myAtoi("-12a3"));
		System.out.println("Input : '2147483648'   Output : " + myAtoi("2147483648"));
		System.out.println("Input : '123'   Output : " + myAtoi("123"));
		System.out.println("Input : '-123'   Output : " + myAtoi("-123"));
		System.out.println("Input : ''   Output : " + myAtoi(""));
		System.out.println("Input : 'null'   Output : " + myAtoi(null));		
		
	}
		
    public static int myAtoi(String str) {
        //remove empty spaces
        //get sign + or - 
        //check for valid digit, if alphabet is found then return
        //check for overflow
        
        long sum = 0;	//use this as long since if we use int and overflow happens then we get unexpected result
        				//with long we will get correct result and we can compare with Integer.MAX_VALUE and Integer.MIN_VALUE
        int sign = 1;
        int start = 0;
        
        if(str == null){
            return (int) sum;
        }
        
        //remove empty spaces
        str = str.trim();
        
        if(str.length() <= 0){
            return 0;
        }
        
        //get sign + or -
        char firstChar = str.charAt(start);
        if(firstChar == '+'){	//using single quote if its char check
            sign = 1;
            start++;
        }else if(firstChar == '-'){ //using single quote if its char check
            sign = -1;
            start++;
        }
        
        
        for(int i = start; i < str.length(); i++){
            
            if((str.charAt(i)) < '0' || (str.charAt(i)) > '9'){	//char can be converted to int by checking with single quote
                return (int)(sign * sum);
            }
            
            sum = sum * 10 + ((str.charAt(i) - '0'));	//char can be converted to int by subtracting with single quote '0'
            
            if(sign == 1 && sum > Integer.MAX_VALUE){
            	return Integer.MAX_VALUE;
            }else if(sign == -1 && sum * (-1) < Integer.MIN_VALUE){
            	return Integer.MIN_VALUE;
            }
        }
        
        return (int)(sign * sum);
    }
    
}
