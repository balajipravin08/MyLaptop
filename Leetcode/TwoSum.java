class TwoSum{

	public static String twoSum(int[] arr,int num){
		for (int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++)
			{
				int temp = num-arr[i];
				if (arr[j]==temp)
				return i +","+ j;
			}
		}
		return null;
	}
	
	public static String two(int[] arr,int num){
		for (int i=0;i<arr.length;i++)
		{
			int temp = num-arr[i];
			int low = 0;
			int high = arr.length-1;
			while (low<=high){
			int mid = (low+high)/2;
				if (arr[mid] == temp ){
				return i+","+mid ;
				}
				else if (arr[mid]<temp){
					low = mid+1;
				}
				else if (arr[mid]>temp)
				{
					high=mid-1;
				}	
			}
		}
			return null;
		
	}
	public static void main(String[] args){
		int[] arr = {1,2,5,8,15};
		int num = 13;
		System.out.println(two(arr,num));
		System.out.println(twoSum(arr,num));
	}
}
