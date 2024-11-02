import java.util.Scanner;
import java.util.Arrays;
public class P1 {
	
	static void sortIntArray(int[] num)
	{
		int temp=0;
	for(int i = 0;i<num.length;i++)
    	{
    		for (int j=i+1;j<num.length;j++)
    		{
    			if (num[i]>num[j])
    			{
    				temp = num[j];
    				num[j]=num[i];
    				num[i]=temp;
    			}
    		}
    	}
	}
	
	static void sortStringArray(String[] str)
	{
		String temp1 = "";
	
	for(int i = 0;i<str.length;i++)
    	{
    		for (int j=i+1;j<str.length;j++)
    		{
    			if (str[i].compareTo(str[j])>0)
    			{
    				temp1 = str[j];
    				str[j]=str[i];
    				str[i]=temp1	;
    			}
    		}
    	}
	}
	
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	int[] num = {1,4,2,4,6,8,3};
    	String[] str = {"arun","bala","ashok","arun"};
    	sortIntArray(num);
    	System.out.print(Arrays.toString(num));
    	sortStringArray(str);
    	System.out.print(Arrays.toString(str));

    	
    }
}    	
