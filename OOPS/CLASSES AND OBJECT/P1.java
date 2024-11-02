import java.util.Scanner;
class Student {
	private String name;
	private int age;
	private char grade;
	Student (String name,int age,char grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGrade() {
		return grade;
	}
	
}

public class P1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of student : ");
	int noOfStudent = sc.nextInt();
	sc.nextLine();
	Student[] stu = new Student[noOfStudent];
	for(int i=0;i<noOfStudent;i++)
	{
		
		System.out.print("Enter a student details in (name,age,grade) : ");
		String str = sc.next();
		String arr[]=str.split(",");
		int age =Integer.valueOf(arr[1]);
		char grade=arr[2].charAt(0);
		Student s = new Student(arr[0],age,grade);
		stu[i]=s;
	}
	for(Student s:stu)
		System.out.println("Name : "+s.getName()+"\nage : "+s.getAge()+"\ngrade : "+s.getGrade());
	}
}
