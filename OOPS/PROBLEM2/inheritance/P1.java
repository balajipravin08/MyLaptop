package inheritance;
import java.util.Scanner;
interface Display{
	abstract void display();
}
abstract class Animal implements Display{
	private String name;
	private int age;
	private String species;
	public Animal(String name,int age,String species){
		this.name=name;
		this.age=age;
		this.species=species;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getSpecies(){
		return species;
	}
	public abstract void display();
	
}
class Dog extends Animal  {
	private String breed;
	private String color;
	public Dog(String name,int age,String species,String breed,String color){
		super(name,age,species);
		this.breed=breed;
		this.color=color;
	}
	public String getBreed(){
		return breed;
	}
	public String getColor(){
		return color;
	}
	public void display(){
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSpecies());
		System.out.println(getBreed());
		System.out.println(getColor());
	}
}
class Cat extends Animal{
	private String breed;
	private String color;
	public Cat(String name,int age,String species,String breed,String color){
		super(name,age,species);
		this.breed=breed;
		this.color=color;
	}
	public String getBreed(){
		return breed;
	}
	public String getColor(){
		return color;
	}
	public void display(){
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSpecies());
		System.out.println(getBreed());
		System.out.println(getColor());
	}
}
public class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a animal name : ");
		String name = sc.nextLine();
		System.out.println("Enter a animal age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a animal species : ");
		String species = sc.nextLine();
		System.out.println("Enter a "+species+" breed : ");
		String breed = sc.nextLine();
		System.out.println("Enter a "+species+" color : ");
		String color = sc.nextLine();
		
		Dog obj = new Dog(name,age,species,breed,color);
		System.out.println(obj.getBreed());
		obj.display();
	}
}
