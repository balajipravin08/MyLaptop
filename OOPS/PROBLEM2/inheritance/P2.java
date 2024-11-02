package inheritance;
import java.util.Scanner;
interface Display{
	void display();
}
abstract class Vehicle implements Display{
	private final String name ;
	private String brand;
	private String model;
	private int year;
	
	public Vehicle (String name,String brand,String model,int year){
		this.name=name;
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	public String getName(){
		return name;
	}
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public int getYear(){
		return year;
	}
	public abstract void display();
}
class Car extends Vehicle{
	private String color;
	private byte noOfDoor;
	public Car(String name,String brand,String model,int year,String color,byte noOfDoor){
		super(name,brand,model,year);
		this.color=color;
		this.noOfDoor=noOfDoor;
	}
	public String getColor(){
		return color;
	}
	public byte getNoOfDoors(){
		return noOfDoor;
	}
	public void display(){
		System.out.println("Vehicle name is : "+getName());
		System.out.println(getName()+" brand is : "+getBrand());
		System.out.println(getName()+" model is : "+getModel());
		System.out.println(getName()+" year is : "+getYear());
		System.out.println(getName()+" color is : "+getColor());
		System.out.println(getName()+" noOfDoor : "+getNoOfDoors());
	}
	
}
public class P2{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of vechicle : ");
		int num = sc.nextInt();
		Car[] arr = new Car[num];
		sc.nextLine();
		
		for(int i=0;i<num;i++){
			System.out.println("Enter a brand of car "+(i+1)+" : ");
			String brand = sc.nextLine();
			System.out.println("Enter a model of car "+(i+1)+" : ");
			String model = sc.nextLine();
			System.out.println("Enter a color of car "+(i+1)+" : ");
			String color = sc.nextLine();
			System.out.println("Enter a year of car "+(i+1)+" : ");
			int year = sc.nextInt();
			System.out.println("Enter a no of doors in car "+(i+1)+" : ");
			byte noOfDoor=sc.nextByte();
			sc.nextLine();
			Car c = new Car("car",brand,model,year,color,noOfDoor);
			arr[i]=c;
		}
		for (Car s : arr){
			s.display();
		}
	}
}
