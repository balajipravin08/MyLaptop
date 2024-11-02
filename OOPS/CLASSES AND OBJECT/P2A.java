import java.util.Scanner;
class BankAccount {
	private int balance;
	private int accountNumber;
	private String accountType;
	
	BankAccount(){
	
	}
	BankAccount(int balance,int accountNumber,String accountType){
		
		this.balance=balance;
		this.accountNumber=accountNumber;
		this.accountType=accountType;
	}
	public void setData(int balance,int accountNumber,String accountType){
		this.balance=balance;
		this.accountNumber=accountNumber;
		this.accountType=accountType;
	}
	public int getBalance(){ return balance;}
	public int getAccountNumber() {return accountNumber;}
	public String getAccountType() {return accountType;}
}
public class P2A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of bank account : ");
		int n = sc.nextInt();
		sc.nextLine();
		BankAccount[] arr=new BankAccount[n];
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print("Enter a accounttype : ");			
			String accountType = sc.next();
			System.out.print("Enter a balance : ");
			int balance = sc.nextInt();
			System.out.print("Enter a account number : ");
			int accountNumber = sc.nextInt();
			BankAccount b = new BankAccount(balance,accountNumber,accountType);
			
			arr[i]=b;
		}
		for(BankAccount a:arr)
		{
			System.out.println(a.getBalance()+" "+a.getAccountNumber()+" "+a.getAccountType());
		}
		
	} 
}
