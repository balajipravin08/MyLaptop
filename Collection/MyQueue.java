class MyException extends Exception{
	MyException(){}
	MyException(String s){
		super(s);
	}
}

class MyQueue<T>{
	private T[] array ;
	private static int capacity = 3;
	int size =0;
		MyQueue(){
			array =(T[])new Object[capacity];
		}
		MyQueue(int capacity){
			array = (T[])new Object[capacity];
		}
		
		
		public int size(){
			return size;
		}
		private void grow(){
			capacity = capacity*2;
			T[] temp = (T[])new Object[capacity];
			for(int i=0;i<size;i++){
				temp[i]=array[i];
			}
			array = temp;
		}
		public boolean isEmpty(){
			if(size==0) return true;
			return false;
		}
		public void offer(T value){
			add(value);
		}
		public  void add(T value){
			if(size==capacity) grow();
			array[size]=value;
			size++;
		}
		public T poll(){
			if(isEmpty()) return null;
			T ans=array[0];
			for(int i=1;i<size;i++){
				array[i-1]=array[i];
			}
			//array[size-1]=0;
			size--;
			return ans;
		}
		public  T remove() throws MyException{
			if(isEmpty()) throw new MyException("STACK IS EMPTY");
			T ans=array[0];
			for(int i=1;i<size;i++){
				array[i-1]=array[i];
			}
			array[size-1]=null;
			size--;
			return ans;
		}
		public  T peek()throws MyException{
			if(isEmpty()) throw new MyException("STACK IS EMPTY");
			
			return array[0];
		}
		public int search(T value){
			for(int i=0;i<size;i++){
				if(array[i]==value)
				return i;
			}
			return -1;
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
class QueueDemo {
	public static void main(String[] args){
		MyQueue<Integer> que = new MyQueue<>();
		que.add(1);
		que.add(2);
		que.add(1);
		que.add(2);
		//que.peek();
		System.out.println(que);
		
	}
}
