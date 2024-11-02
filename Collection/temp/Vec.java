import java.util.*;
public class Vec{ 
	int i ;
	Vec(){
		i=10;
	}
	public void finalize(){
		System.out.println("hi");
	}
	public static void main(String[] args){
		Vec a =new Vec();
		Vec a1 =new Vec();
		a=null;
		System.gc();
		System.out.println(a1.i);
		System.out.println(a);
		System.out.println("HHHHHHH");
		a1=null;
		System.gc();
		System.out.println(a1);
		System.out.println("HHHHHHH1");
		
	}
}


