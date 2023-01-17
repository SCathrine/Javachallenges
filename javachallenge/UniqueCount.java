package javachallenge;

import java.util.Arrays;

public class UniqueCount {

	public static void main(String[] args) {
		
		int[] num= {1,4,4,4,1,2,2,3,3};
		int[] c=new int[6];
		int[] num1=new int[9];
		int count=1,counts=0;
		int n=num[0];
		Arrays.sort(num);
			for(int i=0;i<num.length;i++) {
				
				if(n==num[i]) {
					
				c[n]=c[n]+count;
				num1[n]=num[i];
					 
					
				}
				else {
					
					n=num[i];
					count=1;
					//index++;
					c[n]=count;
					
					num1[n]=num[i];
					
				}
				
				
				}
			
			int length = c.length;
			for(int i=1;i<=c.length;i++) {
				
				for(int j=i+1;j<c.length;j++) {
				
				if(c[i]==c[j]) {
					
					counts=counts+1;
					
				}
				else {
					
					counts=0;
					
				}
				
			}
			
			}
			
			if(counts==(length+1)) {
				
				System.out.println("false");
			}
			else {
				
				System.out.println("true");
			}
			  
		

	}

}
