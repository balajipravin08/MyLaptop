package INFORMATION;
public class StudentIdCard {
	
	private String studentName;
	private int rollno;
	private int grade;
	private char section;
	private String dob;
	
	public StudentIdCard(String studentName,int rollno,int grade,char section,String dob){
		
		this.studentName=studentName;
		this.rollno=rollno;
		this.grade=grade;
		this.section=section;
		this.dob=dob;
	}
	public String getData(){
		
		return "Name : "+studentName+"\nRollno : "+rollno+"\nGrade : "+grade+"\nSection : "+section+"\nD-O-B : "+dob;
	}
}
