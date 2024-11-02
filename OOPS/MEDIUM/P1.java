import java.util.Scanner;
import INFORMATION.*;
public class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students  : ");
		int n = sc.nextInt();
		sc.nextLine();
		StudentIdCard[] sid = new StudentIdCard[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("-----Enter "+(i+1)+"st Student data -----");
		System.out.print("Enter a sname : ");
		String name = sc.nextLine();
		System.out.print("Enter a RollNo : ");
		int rollno = sc.nextInt();
		System.out.print("Enter a grade : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a section : ");
		char section = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Enter a DOB : ");
		String dob=sc.nextLine();
		StudentIdCard s = new StudentIdCard(name,rollno,grade,section,dob);
		sid[i]=s;
	}
		for(StudentIdCard s:sid){
		System.out.println(s.getData());
		}
	}
}

