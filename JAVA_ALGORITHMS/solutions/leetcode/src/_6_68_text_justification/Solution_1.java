package _6_68_text_justification;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	/*
	 * Given an array of words and a length L, format the text such that each line has exactly L 
	 * characters and is fully (left and right) justified.

		You should pack your words in a greedy approach; that is, pack as many words as you can in each line. 
		Pad extra spaces ' ' when necessary so that each line has exactly L characters.
		
		Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line 
		do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
		
		For the last line of text, it should be left justified and no extra space is inserted between words.
		
		For example,
		words: ["This", "is", "an", "example", "of", "text", "justification."]
		L: 16.	
	 */
	public static void main(String[] args) {
		System.out.println(fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."} , 16));
	}
	
	public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        boolean lastLine = false;        
        
        //first count 16 characters with space between each word and check how many words can fit
        int max = maxWidth;
        int start = 0;
    	int end = 0;
        for(int i = 0; i < words.length; i++){
        	
        	String word = words[i];
        	int wordLen = word.length();
        	max = max - word.length();
                	
        	
        	if(i + 1 < words.length){        		
        		String nextWord = words[i + 1];
        		int nextWordLen = nextWord.length();	
        		
        		if(max < 0 || max - nextWordLen + 1 < 0){
        			//skip next word and justify
        			StringBuffer str1 = new StringBuffer();
        			
            		for(int j = start; j <= end; j++){
            			
            		}
            		res.add(str1.toString());
            		
        			start = i + 1;
        			end = i + 1;
        		}else{
        			//do nothing go to next
        			end++;
        		}        		
        	}else{
        		lastLine = true;
        	}
        	
        	if(lastLine == true){
        		StringBuffer str = new StringBuffer();
        		for(int j = start; j <= end; j++){
        			str.append(words[j]);
        			if(j < end){
        				str.append(" ");
        			}
        		}
        		res.add(str.toString());
        	}
        	        	
        }
        
    	
        //then total characters minus 16 will be the padding which needs to be added evenly
        //if it is last line then keep them normal and no need to justify them 
        
		return res;
    }
}
