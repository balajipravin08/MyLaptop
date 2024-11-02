import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
class Demo implements Comparator<User>{
	public int compare(User a,User b){
		 return a.name.compareTo(b.name);
	}
}
class User implements Comparable<User>{
	 int id ;
	 String name;

	public User(int id , String name ){
		this.id = id;
		this.name=name;
	}
	public int compareTo(User obj){
		int i = obj.id;
		int j = this.id;
		
		if(i<j) return 1;
		else if (i>j) return -1;
		else return 0;
	}
	public String toString(){
		return id+","+name;
	}
	public static void main(String[] args){
			
		ArrayList<User> list = new ArrayList<>();
		list.add(new User(10,"a"));
		list.add(new User(2,"b"));
		list.add(new User(3,"c"));
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new Demo());
		System.out.println(list);
	}
}
