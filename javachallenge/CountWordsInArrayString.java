package javachallenge;

import java.util.Arrays;

public class CountWordsInArrayString {

	public static void main(String[] args) {
		
		String[] word= {"please wait","continue to fight","continue to win again"};
		String count="";
		int size=0,max=0;
		String[] first=new String[5];
		String s="";
	
		
		      for(int i=0;i<word.length;i++) {
		    	  
		    	  first[i]=word[i];
		    	  	System.out.println(first[i]);
		    	 // int length = first[i].length();
		    	   String[] split = first[i].split(" ");
		    	   size=split.length;
		    	  // System.out.println(size); 
		    	  
		    	   if(size>max) {
		    		   
		    		   max=size;
		    		  s=first[i];
		    	   }
		  
		      }
		      
		      System.out.println(max);
	    	   System.out.println(s);
		      
		      
		          
		      
		      
		      //String[] split = word[0].split(" ");
		      //System.out.println(split);
		

	}

}
