import java.util.Scanner;
class BankAccount {
	private int balance;
	private long accountNumber;
	private String accountType;
	public void setData(int balance,long accountNumber,String accountType) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	
	
}

public class P2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a balance : ");
	int balance = sc.nextInt();
	System.out.print("Enter a accountnumber : ");
	long accountNumber = sc.nextLong();
	System.out.print("Enter a accountType : ");
	String accountType = sc.next();
	BankAccount b = new BankAccount();
	b.setData(balance,accountNumber,accountType);
	System.out.println(b.getBalance()+" "+b.getAccountNumber()+" "+b.getAccountType());
	}
}
