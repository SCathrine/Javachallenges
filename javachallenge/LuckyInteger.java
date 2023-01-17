package javachallenge;

import java.util.Arrays;

public class LuckyInteger {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,3,4,4,4,4};
		int[] num= new int[10];
		int[] lucky= new int[10];
		int occ=0,c=0;
		int max=0;
		int[] o=new int[10];
		boolean flag=true;
		int count=0;
		Arrays.sort(a);
		int newvalue=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(newvalue==a[i]) {
				
				count++;
				occ=0;
				occ=occ+count;
				o[newvalue-1]=occ;
				num[newvalue-1]=newvalue;
				
			}
			else {
				 
				  newvalue=a[i];
				  count=1;
				  occ=0;
				  o[newvalue-1]=count;
				  //occ=occ+count;
				  num[newvalue-1]=newvalue;
				 
			}
	}
		
		for(int i=0;i<o.length;i++) {
		if(o[i]==num[i]) {
			
			lucky[i]=o[i];
			c++;
		}
		
		if(c==0) {
			
			flag=false;
		}
		
		
		}
		if(flag==false) {
		System.out.println("-1");
		}
		
		for(int i=0;i<lucky.length;i++) {
			
			if(max<lucky[i])
			{
				
				max=lucky[i];
			}
			
		}
		
		
		
		
		
		String string = Arrays.toString(a);
		String string2 = Arrays.toString(o);
		String string3 = Arrays.toString(num);
		String string4 = Arrays.toString(lucky);
		System.out.println(string);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
		System.out.println(max);
	}

}
