import java.util.Arrays;

public class P42 {

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        
        int c1 = 0,c2=n-1; 
        int temp=0;


        for (int i = 0; i < n; i++) {
        
            if (arr[i] == 1) {
                
                temp = arr[c2];
                arr[c2]=arr[i];
                arr[i]=temp; 
                
                c2--;
                n--;
                
            }
            
            
        }
        for(int i=0;i<arr.length;i++)
	  System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,1,21,1,1,1,1,2,2,1};
        Arrays.sort(arr);

        moveZeroes(arr);

    }
}

