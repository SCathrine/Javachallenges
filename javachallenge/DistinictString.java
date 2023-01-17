package javachallenge;

public class DistinictString {

	String[] str= {"a","a","b","b","c","d","d"};
	int k=1,count=0,index=0,index1=0;
	int[] c=new int[7];
	String[] str1=new String[7];
	String[] str3=new String[7];
	String s1;
	String s= str[0];
	public void checkcount(int[] counts, String[] str2) {
		
		for(int i=0;i<counts.length;i++) {
			
			if(counts[i]==1) {
				
				str3[index1]=str2[i];
				index1++;
			}
			
		}
		
		if(k>str3.length)
		{
			
			System.out.println("null string");
		}
		
		System.out.println(str3[k-1]);
	}
	
	public static void main(String[] args) {
		
		
		DistinictString ds=new DistinictString();
		
			for(int j=0;j<ds.str.length;j++) {
		
			if(ds.s==ds.str[j]) {
        	
        	ds.count++;
        	ds.c[ds.index]=ds.count;     	
            ds.str1[ds.index]=ds.s;
        }
        else{
        	
        	   ds.s=ds.str[j];
        	   ds.count=1;
        	   ds.index++;
        	   ds.c[ds.index]=ds.count;
           	   ds.str1[ds.index]=ds.s;
        	       	
        }			
	}
			 ds.checkcount(ds.c,ds.str1);
	    	
		
		

}
}
