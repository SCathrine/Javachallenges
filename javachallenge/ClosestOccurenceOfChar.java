package javachallenge;

import java.util.Arrays;

public class ClosestOccurenceOfChar {

	//JAVACHALLENGE 20
	public static void main(String[] args) {
		
		String word="aab";
		String s="b";
        int location=1,index=0;
        //String[] newindex=new String[3];
		int[] num=new int[4];
		String[] split = word.split("");
		int length = split.length;
		for(int i=0;i<split.length;i++) {
			
			System.out.println(split[i]);
			if(split[i].equals(s)) {
				
				System.out.println("index of " +s +" " +"is " +i);
				
				for(int j=length-1;j>=0;j--) {
				
					
					num[j]=index;
					index++;
			}
				
				String string = Arrays.toString(num);
				
				System.out.println(string);
			
			
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
