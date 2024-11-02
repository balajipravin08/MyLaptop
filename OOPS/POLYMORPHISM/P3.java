interface Playable {
	void play ();
}
interface Play{
	void get();
}
class Guitar implements Playable,Play{
	public void play(){
	get();
	System.out.println("play guitar");	
	}
	public void get(){
	System.out.println("get");
	}
}
class Piano implements Playable{
	public void play(){
		System.out.println("play ");
	}
}


public class P3{
	public static void main (String[] args){
		Guitar g = new Guitar();
		g.play();
		Piano p = new Piano();
		p.play();
	} 
}
