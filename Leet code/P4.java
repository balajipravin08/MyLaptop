import java.util.*;
class P4{
	public static void main(String[] args){
		int[] a = {8,4,1,9,6,2,0};
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		int[] f = new int[max+1];
		for(int i : a){
			f[i-0]++;
		}
		System.out.println(Arrays.toString(f));
		
		for(int i=0;i<a.length;i++){
			for(int j=a[i] ;j<f.length;j++){
				int temp = j+1;
				if(temp>=f.length){
						System.out.println(a[i]+"->");
					}
				if(temp<f.length&&f[temp]!=0){
					
					System.out.println(a[i]+"->"+temp);
					break;
				}
			}
		}
	}
}
