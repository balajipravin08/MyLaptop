package src;
class MyException extends Exception{
	MyException(){
		System.out.println("constructor");
	}
	MyException(String s){
		super(s);
	}
	
}
public class Demo {
    public static void main(String[] args) {
    //Demo v = new Demo();
    MyException obj = new MyException();
        try{
        	throw new MyException("s");
        }
        catch(Exception e ){
        	System.out.println(e);
        	System.out.println(e	.getMessage());
        }
    }
}
