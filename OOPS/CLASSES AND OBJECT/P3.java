import java.util.Scanner;
class Rectangle {
	private float length;
	private float width;
	
	Rectangle(float length,float width) {
		this.length=length;
		this.width=width;
	}
	
	public float getArea(float length,float width) {
		float area = length*width;
		return area;
	}
	public float getPerimeter(float length,float width) {
		float perimeter = 2*(length+width);
		return perimeter;
	}
}

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a length : ");
		float length = sc.nextFloat();
		System.out.print("enter a width : ");
		float width = sc.nextFloat();
	
		Rectangle r = new Rectangle(length,width);
		System.out.println("the area of a rectangle is : "+r.getArea(length,width));
		System.out.println("the perimeter of a rectangle is : "+r.getPerimeter(length,width));
	}
}
