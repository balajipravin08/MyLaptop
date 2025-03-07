class MyException extends Exception{
	MyException(){}
	MyException(String s){
		super(s);
	}
}
class MyStack<T>{
	T[] array ;
	private static int capacity = 10;
	int size =0;
		MyStack(){
			array = (T[])new Object[capacity];
		}
		MyStack(int capacity){
			array =  (T[])new Object[capacity];
		}
		
		
		public int size(){
			return size;
		}
		private void grow(){
			capacity = capacity*2;
			T[] temp =  (T[])new Object[capacity];
			for(int i=0;i<size;i++){
				temp[i]=array[i];
			}
			array = temp;
		}
		public boolean isEmpty(){
			if(size==0) return true;
			return false;
		}
		public void push(T value){
			if(size==capacity) grow();
			array[size]=value;
			size++;
		}
		public T pop() throws MyException{
			if(isEmpty()) throw new MyException("STACK IS EMPTY");
			T ans=array[size-1];
			array[size-1]=null;
			size--;
			return ans;
		}
		public T peek()throws MyException{
			if(isEmpty()) throw new MyException("STACK IS EMPTY");
			return array[size-1];
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
class StackDemo{
	public static void main(String[] args)throws MyException{
		MyStack<String> stk = new MyStack<>();
		//stk.peek();
		stk.push(10);
		stk.push(100);
		stk.push(1000);
		stk.push(10000);
	
		System.out.println(stk.peek());
		System.out.println(stk.search(100000));
		System.out.println(stk.size());
		System.out.println(stk);
		
	}
}
