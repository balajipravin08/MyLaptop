class MyArrayList<T>{
	private T[] array;
	private static int capacity = 10 ;
	private int size;
	
	public MyArrayList(){
		array=(T[])new Object[capacity];
	}
	public MyArrayList(int capacity){
		array=(T[])new Object[capacity];
	}
	private void grow(){
			capacity = (capacity*3/2)+1;
			T[] temp =  (T[])new Object[capacity];
				for(int i=0;i<size;i++){
					temp[i]=array[i];
				}
					array = temp;
		}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0) return true;
		return false;
	}
	public void add(T a){
		if(size==capacity){
			grow();
		}
			array[size]=a;
			size++;
	}
	public T get(int index){
		return array[index];
	}
	public T remove (T value){
		boolean flag = false;
		for(int i=0;i<size;i++){
			if(value == array[i]){
			flag=true;
			int j=i;
				while(j<size-1){
					array[j]=array[j+1];
					j++;
				}
				break;
			}
		}
		if(flag){
		size--;
			return value;
		}
		return null;
	}
	public T set (T value){
		add(value);
		return value;
	}
	public T set (int index , T value){
		return array[index]=value;
	}	
	public String toString(){
			StringBuffer s =  new StringBuffer();
			for(int i=0;i<size;i++){
				s.append(array[i]);
				if(i<size-1)
				s.append(",");
			}
			if(isEmpty()) s.append("[]");
			else {
				s.insert(0,"[");
				s.append("]");
			}
			return s.toString();
		}
}	
class ArrayListDemo{
	public static void main(String[] args){
		MyArrayList <Integer>list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		
		System.out.println(list.remove(10));
		System.out.println(list.size());
		//System.out.println(list.capacity);
		
		System.out.println(list);
	}
}
