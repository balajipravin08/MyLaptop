class P2{
	public static void main(String[] args){
		int n = 13;
		int count =0		;
		for(int i=1;i*i<=n;i++)
		{
			if ((n%i)==0){
			count++;
			}
			if ((n/i)!=i){
			count++;
			}
		}
		if (count ==2)
		System.out.println("true");
		else
		System.out.println("false");
	}
}
