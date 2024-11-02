package CLASSANDOBJECT;
import java.util.Scanner;
class BankAccount{
	private int balance;
	private int accountNumber;
	private String accountType;
	
	BankAccount(int balance,int accountNumber,String accountType){
		this.balance=balance;
		this.accountNumber=accountNumber;
		this.accountType=accountType;
	}
	
	public int getBalance(){
		return balance;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountType(){
		return accountType;
	}
	
	public String toString(){
		return ""+balance+" "+accountNumber+" "+accountType;
	}
}
public class P2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of bank account : ");
		int num =sc.nextInt();
		BankAccount[] arr = new BankAccount[num];
		for (int i=0;i<num;i++)
		{
			System.out.println("Enter a balance : ");
			int balance = sc.nextInt();
			System.out.println("Enter a accountNumber : ");
			int accountNumber = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a accountType : ");
			String accountType = sc.next();
			
			BankAccount obj = new BankAccount(balance,accountNumber,accountType);
			arr[i]=obj;
		}
		
		for(BankAccount b:arr)
		{
			System.out.println(b);
		}
		
	}
}
