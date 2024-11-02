package CLASSANDOBJECT;
import java.util.Scanner;
class Rectangle{
	private float length;
	private float width;
	Rectangle (float length,float width){
		this.length=length;
		this.width=width;
	}
	public float getArea (){
		float area = (float)length*width;
		return area;
	}
	public float getPerimeter(){
		float perimeter = (float)2*(length+width);
		return perimeter;
	}
}
public class P3 extends Rectangle {
	P3(float length,float width){
		super(length,width);
	}
	
	public static void main(String[] args){
		Rectangle r = new Rectangle(12f,45f);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length : ");
		float length = sc.nextFloat();
		System.out.println("Enter a width : ");	
		float width = sc.nextFloat();
		P3 obj = new P3(length,width);
		System.out.println("The area of rectangle is : "+obj.getArea());
		System.out.println("The perimeter of rectangle is : "+obj.getPerimeter());
	}
}
