class MyArrayList {
	private int[] array ;
	private int size =0;
	MyArrayList(){
		this(10);
	}
	MyArrayList(int capacity){
		array=new int[capacity];
	}
	private void grow(){
		capacity = capacity*2;
		int[] temp = new int[capacity];
		for(int i=0;i<size;i++){
			temp[i]=array[i];
		}
		array = temp;
	}
	public void add(int val){
		if(size==capacity){
			grow();
		}
		array[size]=val;
		size++;
	}
	public String toString(){
		String s = "";
		for(int i=0;i<size;i++){
			if(i<size-1)
				s=s+array[i]+ ",";
			else
				s=s+array[i];
		}
		return s;
	}
}
class Demo {
	public static void main(String[] args){
		MyArrayList list = new MyArrayList();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(10);
		list.add(11);
		list.add(13);	
		System.out.println(list);
	}
}
