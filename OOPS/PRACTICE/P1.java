import java.util.Scanner;
class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int t1 =0;
		int t2=0;
		while (copy>0){
			t1 = copy%10;
			t2 = t2+(t1*t1*t1*t1);
			copy = copy/10;
		}
		if (t2==num)
		System.out.print("true");
		else
		System.out.print("false");
	}
}
