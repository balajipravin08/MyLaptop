import java.util.*;
class P5 {
	public static boolean check(String s){
		for(String s1 : s.split("\\.")){
    			if((s1.charAt(0)=='0' && s1.length() >1) || (Integer.parseInt(s1) > 255 || s1.length()>3  )) return false;
    		}
    			return true;
	}
    public static void main(String[] args) {
    	String s = "100.01.1.1";
    	System.out.println(check(s));
    	
    }
}
