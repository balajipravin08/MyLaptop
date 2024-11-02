import java.util.Scanner;

class P8//number prymid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a num of lines : ");
		int n= sc.nextInt();
		int i,j,s;
			
			for(i=1;i<=n;i++)
			{
			for(j=1;j<=n;j++){
			if(j<n-i-1){
			System.out.print("  ");
			}else
			System.out.print(j+1+" ");
			}
			for(j=i;j>0;j--){
			System.out.print(j+" ");
			}
			 
			System.out.println();
			}
				
				
	}
	
}
