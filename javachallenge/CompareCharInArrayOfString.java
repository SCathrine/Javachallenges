package javachallenge;

import java.util.Arrays;

//JAVACHALLENGE 19
public class CompareCharInArrayOfString {

	public static void main(String[] args) {
		
		String[] words= {"bella","label","roller"};
		String[] string= new String[3];
        String firstword="";
        String secword="";
        String thirdword="";
        int index=0;  
        char storechar;
        String string2="";
        
        firstword=words[0];
        for(int i=0;i<words.length;i++) {
			
        	if(i==1) {
        		
        		secword=words[i];
        	}
        	else {
        		
        		thirdword=words[i];
        	}   	
        }
        System.out.println(firstword);
        System.out.println(secword);
        System.out.println(thirdword);
   		int firstwordlength = firstword.length();
		    System.out.println(firstwordlength);
		    
		    for(int i=0;i<firstwordlength;i++) {
		    	
		    	storechar = firstword.charAt(i);
		    	string2 = String.valueOf(storechar);
		    	System.out.println("String2," +string2);
		    	if(thirdword.contains(string2)&&secword.contains(string2)) {
		    		
		    		string[index]=string2;
		    		index++;
		    	}
			    	
		    	}
		    
		    String string3 = Arrays.toString(string);
		    System.out.println(string3);
		    
		    }
		    }
		    

		    
	
		



