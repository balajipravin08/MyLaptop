package EASY;
public class Find2ndMax extends Array{
	public int find2ndMax(int[] arr){
		int max1=0,max2=0;
		if (arr[0]<arr[1])
		{
			max1=arr[1];
			max2=arr[0];
		}
		else
		{
			max1=arr[0];
			max2=arr[1];
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if (max1<arr[i])
			{
				max2=max1;
				max1=arr[i];
			}
			else if (max2<arr[i]){
			 max2=arr[i];
		 	}	
		}
		return max2;
	}
	
	public static void main(String[] args){
		Find2ndMax obj = new Find2ndMax();
		System.out.println("enter a size of an array : ");
		int size = obj.input.nextInt();
		int[] arr = obj.createarray(size);
		System.out.println("The second max element is : "+obj.find2ndMax(arr));
	}
}
