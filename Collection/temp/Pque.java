import java.util.*;

class Pque{
	
	public static void main(String[] args){
		String s ="water";
		int len = s.length();
		int k=len-1;
		
		for(int i=0; i<len; i++){
			for(int j=0; j<len; j++){
				if(i==j || j==k){
					System.out.print(s.charAt(i));
					k--;
				}	
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		 
		
	}
}	
