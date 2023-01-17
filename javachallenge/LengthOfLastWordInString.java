package javachallenge;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
      String s="fly me to the moon and sun my darling";
      String[] split = s.split(" ");
      for(int i=0;i<split.length;i++) {
        System.out.println(split[i]);
  }
      
      /*method 1
         char[] charArray = split[4].toCharArray();
                          int length = charArray.length;
         System.out.println("length of last word " +split[4]+ " is " +length);*/
      
         
      //method 2
         int length2 = split.length;
         System.out.println("Length of the Split[] is: " +length2);
         int len = length2 -1;
         System.out.println("Last word is:"+split[len]);
          /*for(int i=length2-1;i>3;i--) {
        	  
        	  char[] charArray = split[i].toCharArray();
        	  System.out.println(charArray);
        	  int length = charArray.length;
        	  System.out.println("Length of last word" +" " +split[i]+" " +"is" +" " +length);
        	  
          }*/
         
      
      }

}


