class P1{

	public static void main(String[] args){
		int n = 13;
		int gap = 2;
		int[] a = new int[n] ;
		
		int[] ans =new int[gap];
		
		for(int i=0;i<n;i++){
			a[i]=i+1;
			ans[i%gap]=ans[i%gap] + a[i];
		}
		for(int k : ans)
		System.out.println(k);
	}
}
