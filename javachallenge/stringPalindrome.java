package javachallenge;

public class stringPalindrome {

	public static void main(String[] args) {
		
		String s="A man, a plan, a canal: panama";
		//String s=" ";
		//String s="race a car";
		//convert to lowercase
		String lowerCase = s.toLowerCase();
		System.out.println("To lowercase:" +lowerCase);
		String rev="";
       // remove non alphanumeric characters
		//use regular expression [^a-zA-Z0-9] or [^\W]
		//replace it with null value
		String replaceAll = lowerCase.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Removing non-alphanumeric char: " +replaceAll);
		//find length of string
		int length = replaceAll.length();
		System.out.println("Length of String: " +length);
		//compare char 
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+replaceAll.charAt(i);
			
		}
		System.out.println("Reverse String:" +rev);
	
		if(rev.equals(replaceAll)) {
			
			System.out.println("Given String is a Palindrome");
		}
		else {
			
			System.out.println("Not a Palindrome");
		}
		
	}

}
