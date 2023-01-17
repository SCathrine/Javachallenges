package javachallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Shuffle {

	public static void main(String[] args) {
		
		String s="is2 sentence4 a3 This1 ";
		String check="";
		String str="";
		char charAt =0;
		int count=0;
		int count1=0;
		String[] output = new String[4];
		
		String[] split = s.split(" ");

		   for (int j=0;j<split.length;j++)
		   {
			   
			  System.out.println(split[j]);
  
		   }

		   int length = split.length;
		  // System.out.println("length " +length);
		   
		   for(int i=0;i<length;i++) {
			   
			   int len = split[i].length();
			 //  System.out.println("len " +len);
			   charAt = split[i].charAt(len-1);
			   count =Character.getNumericValue(charAt);  
			   output[count-1] = split[i];
			  // System.out.println("Output -" +output[count-1]); 
			  	   
	}
		   
		   check = Arrays.toString(output);
		  // System.out.println("Final -" +check);  
		   str = check.replaceAll("[^a-zA-Z ]", "");
		   System.out.println("Final output -" +str); 
	}
}

