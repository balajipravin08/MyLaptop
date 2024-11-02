import java.util.Arrays;

public class P26 {

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int count = 0; 


        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
                arr[i]=0;
            }
        }
        for(int i=0;i<n;i++)
	  System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,0,3,4,0,0};
        moveZeroes(arr);

    }
}

