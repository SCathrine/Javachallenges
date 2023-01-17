package javachallenge;

import java.util.Arrays;

public class UniqueArrayElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,1,3,2};
		int[] unique=new int[4];
		int[] num=new int[4];
		int newvalue,count=0,sum=0,index=0;
		boolean flag=false;
		
		Arrays.sort(a);
		newvalue=a[0];
		
		for(int i=0;i<a.length;i++) {
		if(newvalue==a[i]) {
			
			count++;
			unique[index]=count;
			num[index]=newvalue;
			
		}
		else {
			
			index++;
			newvalue=a[i];
			count=1;
			unique[index]=count;
			num[index]=newvalue;
			
		}
			
		}
		
		for(int i=0;i<unique.length;i++) {
			
			if(unique[i]==1) {
				
				flag=true;
				sum=sum+num[i];
			}
			
			
			
		}
		System.out.println(sum);
		if(flag==false) {
			
			System.out.println("no unique value");
		

	}
	}
}
