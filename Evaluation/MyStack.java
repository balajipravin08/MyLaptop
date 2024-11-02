class MyStack {
	private int[] array;
	private int size = 0;
	 private int capacity=10;
	 
	 MyStack(){
	 	array = new int[capacity];
	}
	public void push(int val){
		array[size]=val;
		size++;
	}
	public int pop(){
		if(size==0){
			System.out.println("no element");
			return -1;
		}
		int val =array[size-1];
		size--;
		return val;
	}
	
}
class DemoS{
	public static void main(String[] args){
		MyStack stk = new MyStack();
		
		System.out.println(stk.pop());
		System.out.println(stk.pop());
	}
}
