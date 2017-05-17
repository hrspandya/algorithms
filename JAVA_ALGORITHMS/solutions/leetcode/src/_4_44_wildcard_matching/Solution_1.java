package _4_44_wildcard_matching;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(isMatch("aa", "aa"));
	}
	
	public static boolean isMatch(String s, String p) {
        if(s == p){
            return true;
        }
        
        for(int i = 0; i < s.length() && i < p.length(); i++){
            char s1 = s.charAt(i);
            char p1 = p.charAt(i);
            
            if(p1 == '*'){
                return true;
            }else if(p1 == '?'){
            	if(i == p.length() - 1 && i < s.length() - 1){	//if last character in p  but s is bigger then false
            		return false;
            	}else{
            		continue;
            	}                
            }else if(p1 == s1){
                continue;
            }else{
                return false;
            }
        }
        
        return false;
    }
}
