import java.util.Arrays;
class ContainsDuplicates{
	public static boolean isContains(int[] arr,int n){
		for (int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if (arr[i]==arr[j])
				return true;
			}
		}
		return false;
	}
	public static boolean isContains1(int[] arr,int n){
		Arrays.sort(arr);
		for(int i=1;i<n;i++){
			if (arr[i]==arr[i-1])
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,1};
		int n = arr.length;
		System.out.print(isContains1(arr,n));
	}
}

