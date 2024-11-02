class Shape {
	void draw(){
	System.out.println("Drawing a Shape ");
	}
}
class Rectangle extends Shape {
	void draw(){
	int a =10;
	System.out.println("Drawing a Rectangle "+a);
	}
}
class Circle extends Rectangle {
	void draw(){
		System.out.println("Drawing a Circle ");
	}
	
}
public class P1 {
	public static void main(String[] args){
		Circle c = new Circle();
		c.draw();
	}
}


