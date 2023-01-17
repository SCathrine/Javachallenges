package javachallenge;

public class ShuffleSentenced {

	public static void main(String[] args) {
		
		String sen="";
		
		String word= "This is a sentence";
		String[] split = word.split(" ");
	
		
		for(int i=1;i<=split.length;i++) {
		
			sen=sen+split[i-1]+i;
			
		 
		}
		
    
         System.out.println(sen);
        	
        }
      

}
