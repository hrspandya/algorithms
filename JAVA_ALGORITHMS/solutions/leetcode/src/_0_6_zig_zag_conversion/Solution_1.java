package _0_6_zig_zag_conversion;

public class Solution_1 {

	public static void main(String[] args) {
		System.out.println("Input : AB  Output: " + convert("AB", 3));
		System.out.println("Input : PAYPALISHIRING  Output: " + convert("PAYPALISHIRING", 3));		
	}
	
	public static String convert(String s, int numRows) {
        StringBuffer[] sb = new StringBuffer[numRows];
        int len = s.length();
        
        //init buffer
        for(int j = 0; j < numRows; j++){
            sb[j] = new StringBuffer();
        }
        
        //loop through all chracters in string
        for(int i = 0; i < len; i++){
            
            for(int idx = 0; idx < numRows && i < len; idx++){
                char c = s.charAt(i);
                sb[idx].append(c);
                i = i + 1;
            }
            
            //insert in middle
            if(i < len){
                sb[numRows - 2].append(s.charAt(i));                  
            }
            
        }
        
        
        String res = "";
        for(int idx = 0; idx < numRows; idx++){
            res = res + (sb[idx].toString());
        }
        
        return res;        
    }
	
}
