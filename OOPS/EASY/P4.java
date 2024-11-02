import java.util.Scanner;
public class P4 {
	private int findMax(int[] arr,int size) {
		int max = arr[0];
		for(int i=1;i<size;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		P4 obj = new P4();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size]; 
		
		for (int i=0;i<size;i++){
			System.out.print("Enter a value of an index : "+i+" ");
			arr[i]=sc.nextInt();
		}
		System.out.print("The Max value is : "+obj.findMax(arr,size));	
	} 
}

