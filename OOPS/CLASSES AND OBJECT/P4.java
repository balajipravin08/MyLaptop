import java.util.Scanner;
class Employee {
	private String name;
	private int salary;
	private String hireDate;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setHireDate(String hireDate) {
		this.hireDate=hireDate;
	}
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getHireDate() {
		return hireDate;
	}
}

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.nextLine();
		System.out.print("Enter a salary : ");
		int salary = sc.nextInt();
		System.out.print("Enter a hireDate : ");
		String hireDate = sc.next();
		
		Employee e = new Employee();
		e.setName(name);
		e.setSalary(salary);
		e.setHireDate(hireDate);
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getHireDate());
	}
}
