import java.util.*;
public class dque{ 
	
	private static int extract(int n){
		int temp = n;
		int sum =0;
		while (temp>0){
			sum = sum + temp%2;
			temp = temp /2;
		}
		
		return sum;
	}
	public static void main(String[] args){
		int[] arr = {23,2,30,50,7};
		int[] res = new int[arr.length];
		int[] ans = new int[arr.length];
		int len = arr.length;
		for(int i=0;i<len;i++){
			res[i]=extract(arr[i]);
		}
		System.out.print(Arrays.toString(res));
		int k = 0;
		for(int j =0;j<len;j++){
			int max = Integer.MIN_VALUE;
			int index = -1;
		
		for(int i=0;i<len;i++){
			if(max < res[i]){
				max = res[i];
				index = i;
			}
			if(i==len-1){
				res[index]=0;
				ans[k]=arr[index];
				k++;
			}
		}
		}
		System.out.print(Arrays.toString(ans));
		
	}
}

