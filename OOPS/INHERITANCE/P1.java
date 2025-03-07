import java.util.Scanner;
abstract class Animal {
	String name;
	int age;
	String species;
	<init>
	Animal(String name,int age,String species)
	{
		this.name = name;
		this.age=age;
		this.species=species;
	}
	public String get(){
		return name+" "+age+" "+species ;
	}
}
class Dog extends Animal {
	
	static String breed="lab";
	String color;
	Dog(String name,int age,String species,String breed,String color){
		super(name,age,species);
		this.breed=breed;
		this.color=color;
	} 
	public void display() {
		
		System.out.println(get()+" "+breed+" "+color);
	}
}
class Cat extends Animal {
	
	static String breed;
	String color;
	Cat(String name,int age,String species,String breed,String color){
		super(name,age,species);
		this.breed=breed;
		this.color=color;
	} 
	public void display() {
		
		System.out.println(get()+" "+breed+" "+color);
	}
}

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a animal name : ");
		String name = sc.nextLine();
		System.out.print("enter a animal age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("enter a animal species : ");
		String species = sc.nextLine();
		System.out.print("enter a "+ species +" breed : ");
		String breed = sc.nextLine();
		System.out.print("enter a "+ species +" color : ");
		String color = sc.nextLine();
	
		
		Cat c = new Cat(name,age,species,breed,color);
		c.display();
	}
}
