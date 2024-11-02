import java.util.Scanner; 
public class P1 {
	private int sum(int[] arr,int size){
		int sum =0;
		for(int i=0;i<size;i++){
		sum = sum + arr[i];
		}
		return sum;
	}
	private float calculateAverage(int[] arr,int size){
		float average = (float)sum(arr,size)/size;
		return average;
	} 
	public static void main(String[] args){
		P1 obj = new P1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size]; 
		
		for (int i=0;i<size;i++){
			System.out.print("Enter a value of an index : "+i+" ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("the average is : "+obj.calculateAverage(arr,size));
	}
}
