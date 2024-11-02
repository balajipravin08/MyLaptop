class Animal {
	void speaks(){
		System.out.print("The animal says roar ");
	}
}
class Dog extends Animal {
	void speaks(){
		System.out.print("The dog says woof ");
	}
}	
class Cat extends Animal {

	void speaks(){
		System.out.print("The cat says meow ");
	}
}
public class P2{
	public static void main(String[] args){
		Cat c = new Cat();
		c.speaks();
	}
}
