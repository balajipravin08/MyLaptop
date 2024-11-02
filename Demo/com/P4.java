package EASY;
public class P4 extends Array{

	public int findMax(int arr[]){
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args){
		P4 obj = new P4();
		System.out.print("Enter the size of an array : ");
		int length=obj.input.nextInt();
		int arr[] =obj.createarray(length);
		System.out.println("max value is : "+obj.findMax(arr));
		//obj.printArray(arr);
			
	}
}
