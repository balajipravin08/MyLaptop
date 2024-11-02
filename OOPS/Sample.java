
interface InterFace
{
	double getArea();
	double getPerimeter();
}
class Circle implements InterFace{
	private double radius;
	
	Circle (double radius){
		this.radius=radius;
	}
	public double getArea ()
	{
		return Math.PI*Math.pow(radius,2);
	}
	public double getPerimeter ()
	{
		return 2*Math.PI*radius;
	}
}
class Sample {
	public static void main(String[] args){
		Circle c = new Circle(3);
		System.out.println(c.getArea());
		System.out.print(c.getPerimeter());
		
	} 
}

