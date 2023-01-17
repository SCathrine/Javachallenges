package javachallenge;

public class algorithmToFindNisHappyNo {
	
	public int happy(int a)
	{
	    int n=a;
		int sum=0;
		int q=0;
		int cal=0;
		    
		while(n>1)
	
				 {
					q= n%10; // 19%10=9   //1%10=1         
					n= n/10; //  19/10=1 //1/10=0
					cal=(q*q)+(n*n);  //0+(9*9)+(1*1)=82
					n=cal;  //82
					           
					 
				 }
					return cal;
	}
	
	
		public static void main(String[] args) {
			
			algorithmToFindNisHappyNo a=new algorithmToFindNisHappyNo();
			int happy = a.happy(19);
				 
		    
		    if(happy==1) {
		    	System.out.println("true");
		    }
		    else {
		    	
		    	System.out.println("false");
		    }

}
}