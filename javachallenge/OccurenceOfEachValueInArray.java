package javachallenge;

import java.util.Arrays;

public class OccurenceOfEachValueInArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,2,3,1,1,9,7};
		int count=0;
		int length = a.length;
		System.out.println(length);
		Arrays.sort(a);
		int oc = 0;
		int newvalue=a[0];
		String check;
		boolean flag = true;
		int[] occurence = new int [5];
		for(int i=0;i<length;i++) {
			if (newvalue == a[i]) {
				count++;
			}
			else {
				occurence[oc] = count;
				newvalue = a[i];
				count = 1;
				oc++;
			}
			
						
				
		}
		
			occurence[oc] = count;
			
	 check = Arrays.toString(occurence);
			System.out.println("Occurence,"+check);

			OUTER_LOOP:
				for(int i=0;i<occurence.length;i++) {
					if(occurence[i]!=0) {
						
						for(int j=i+1;j<occurence.length;j++) {
							
							if(occurence[i]==occurence[j]) {

								flag = false;
								break OUTER_LOOP ;
								
							}
							
							
						}
						
						
						flag = true;
				
	
				
				
			}
			
					
	}
			System.out.println("Output: " +flag);
				

}
}

		


