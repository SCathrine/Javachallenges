package javachallenge;

public class findSingleElement {

	public static void main(String[] args) {
		
		int num[]= {2,1,2,4,5,5};
		int count=0;
		int length = num.length;
		//System.out.println(length);
         
		
			for(int i=0;i<length;i++) {

				while(count==length-1){
					
					System.out.println("Single element is: " +num[i-1]);
					count=0;
					break;
				}
				
				if(count!=length-1) {
					
					count=0;
				}
				
			for(int j=i+1;j<=length-1;j++) {
				
				if(num[i]!=num[j]){
					
				count++;
			
				
				}
										
			}
	
		}
			
                
			
			
		}
		
	}

