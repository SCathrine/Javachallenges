package javachallenge;

public class SameString {

	public static void main(String[] args) {
		
		
		String[] word1= {"ab","c"};
		String[] word2= {"a","bc"};
		String comp="";
		String comp1="";
		int length=0;
		int length2=0;
		
		length = word1.length;
		length2 = word2.length;
		
		for(int i=0;i<length;i++) {	
			comp=comp+word1[i];
		}
		
		System.out.println(comp);
		
		for(int i=0;i<length2;i++) {
			comp1=comp1+word2[i]; 
		}
		
		System.out.println(comp1);
		
		if(comp.equals(comp1)) {
			
			System.out.println("True");
		}
		else {
			
			System.out.println("False");
		}
		 
	}

}
