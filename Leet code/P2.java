class P2{
	public static void main(String[] args){
		int[] a = {0,5,6,0,9,0,0,1};

		int max = Integer.MIN_VALUE;
		for(int i=0,j=1;i<a.length&&j<a.length;i++,j++){
			int sum = a[i]+a[j];
			max = Math.max(max,sum);
			
		}	
		System.out.println(max);
	}
}
