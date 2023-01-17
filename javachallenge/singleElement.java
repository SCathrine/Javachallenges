package javachallenge;

public class singleElement {

	public static void main(String[] args) {
		
		
		int num[]= {4,1,2,1,2};
		
		int length = num.length;
		//System.out.println(length);
         
		
			
		for(int i=0;i<length;i++) {
			int count=0;
			for(int j=0;j<length;j++) {
				if(num[i]==num[j]) {
					
					count++;
				}
				
					
				}
			
			if(count==1) {
				
				System.out.println(num[i]);
				
				
			}
			}
		}
	}

	
			
		
	


