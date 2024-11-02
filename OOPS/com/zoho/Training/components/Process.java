package components;
class Process extends Functions {
	int balance = 100000;
	int pin = 1234;
	
	public int withDraw (int amount){
		if (amount>=100&&amount<=9000)
		return amount;
		if (amount<100)
		{
			System.out.println("minimum withdraw amount is 100 ");
		}
		if (amount>9000)
		{
			System.out.println("maximum withdraw amount is 9000 ");
		}
	} 
	public int checkBalance(int pin){
		if (pin == 1234)
		return balance;
	}
	public int pinChange (int pin,int newPin){
		if (pin == 1234)
		{
			this.pin = newPin;
		}
	}
}
