package CLASSANDOBJECT;
import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private int grade;
	public Student (String name,int age ,int grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getGrade(){
		return grade;
	}
	
	public String toString(){
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getGrade());
		return "";
	}
}
public class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num of student : ");
		int num = sc.nextInt();
		sc.nextLine();
		Student[] arr = new Student[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter a student "+(i+1)+" name : ");
			String name = sc.nextLine();
			System.out.println("Enter a student "+(i+1)+" age : ");
			int age = sc.nextInt();
			System.out.println("Enter a student "+(i+1)+" grade : ");
			int grade = sc.nextInt();
			sc.nextLine();
			Student obj = new Student(name,age,grade);
			arr[i]=obj;
		}
		for (int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
