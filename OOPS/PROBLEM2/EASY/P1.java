package EASY; 
import java.util.Scanner;
class Array{
	Scanner input = new Scanner(System.in);
	public int[] createarray(int length){
		int arr[] = new int[length];
		for (int i=0;i<length;i++)
		{
			System.out.println("Enter a num in the "+i+" index");
			arr[i]=input.nextInt();
		}
		return arr;
	}
	
	public void printArray(int arr[]){
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			if (i<arr.length-1)
			System.out.print(arr[i]+",");
			else
			System.out.print(arr[i]);
		}
		System.out.print("]");
	} 
	
}
public class P1 extends Array{
	private int sum(int arr[]){
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
		
	}
	private double average (int sum,int length){
		double average = (double)sum/length;
		return average	;
	}
	public static void main(String[] args){
		P1 obj = new P1();
		System.out.print("Enter the size of an array : ");
		int length=obj.input.nextInt();
		int arr[] = obj.createarray(length);
		int sum=obj.sum(arr);
		System.out.println("sum is : "+sum);
		System.out.println("average is : "+obj.average(sum,length));
		
	}
}
