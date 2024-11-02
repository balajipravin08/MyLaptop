import java.util.*;
class P1{
	public static void main(String[] args){
		HashMap<String,HashMap<String,String>> map = new HashMap<>();
		HashMap <String,String> im= new HashMap<>();
		im.put("A","B");
		im.put("C","D");
		HashMap <String,String> im1= new HashMap<>();
		im1.put("a","b");
		im1.put("c","d");
		
		map.put("1",im);
		map.put("2",im1);
		
		Set s1 = im.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry) itr.next();
			System.out.print("Key  "+me.getKey() +" -"+me.getValue());
		}
		
		
	}
}
