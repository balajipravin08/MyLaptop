class Constructor {
	int age ;
	int id;
	Constructor() {
		this.age = 20;
		System.out.print("20 is here");
	}
	Constructor(int age ,int id)
	{
		this();
		this.age = age;
		this.id = id;
			
	}
	
	
}
public class P1 {
	public static void main(String[] args) {
		Constructor c = new Constructor(21,14);
		System.out.print(c.age+" "+c.id);
	}
}
