public class P5 {
    public static int findTheWinner(int n, int k) {
        if(n==1) return 0;
        return (findTheWinner(n-1,k)+k)%n;
		}
    public static void main(String[] args) {
    	System.out.println(findTheWinner(5,2)+1);
    	
    }
}
