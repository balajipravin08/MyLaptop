class P3{
	public static boolean anagram(String s , String a1){	
		if(s.length()!=a1.length()){
			return false;
		}
		int[] a = new int[26];
		for(char c : s.toCharArray()){
			a[c-'a']++;
		}
		for(char c : a1.toCharArray()){
			a[c-'a']--;
		}
		boolean ans = true;
		for(int i : a){
			if(i!=0)
			return  false;
		}
		return true;
	}
	public static void main(String[] args){
		String s = "anagram";
		String a = "nagaram";
		System.out.println(anagram(s,a));
	}
}
