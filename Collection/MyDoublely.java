import java.util.Iterator;
class MyDoublely <T>{
	Node head;
	Node tail;
	int size ;
	public MyDoublely(){
		head = null;
		tail = null;
	}
		private class Node<T>{
			T data ;
			Node next ;
			Node previous;
			
				public Node (T value){
					data = value;
					next = null ;
					previous = null ;
				}
			
		}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0) return true;
		return false;
	}
	public void addFirst(T value){
		Node newNode = new Node(value);
		newNode.next = head ;
			if(isEmpty()){
				tail = newNode;
			}
			else{
				head.previous = newNode;
				
			}
			head = newNode;
			size++;
	}
	public void add(int index,T value){
		if(index==0){ 
			addFirst(value);
			return;
		}
		if(index == size-1){
			add(value);
			return;
		}
		Node newNode = new Node(value);
		Node temp = head;
		for(int i=1;i<index;i++){
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		newNode.previous = temp;
		temp.next.previous = newNode;
		temp.next = newNode;
		size++;
	}
	public void add(T value){
		addLast(value);
	}
	public void addLast(T value){
		if(isEmpty()){
			addFirst(value);
			return;
		}
		Node newNode = new Node(value);
		newNode.previous = tail;
		tail.next = newNode;
		tail = newNode;
		size++;
		
		
	}
	public T peekFirst(){
		if(isEmpty()){
			return null;
		}
		else{
			return (T)head.data;
		}
	}
	public  T peekLast(){
		if(isEmpty()){
			return null;
		}
		else{
			return (T)tail.data;
		}
	}
	public T removeFirst(){
	
		if(isEmpty()){
			return null;
		}
		T temp =(T) head.data;
		head = head.next;
		head.previous=null;
		size--;
		return (T)temp;
	}
	public T removeLast(){
		if(isEmpty()){
			return null;
		}
		T temp = (T)tail.data;
		tail = tail.previous;
		tail.next = null;
		size--;
		return (T)temp;
	}
	public void remove(T value){
		if(head.data==value){
			removeFirst();
			return;
		}
		if(tail.data==value){
			removeLast();
			return;	
		}
		Node temp = head;
		while(temp!=null){
			if(temp.data==value){
				temp.next.previous=temp.previous;
				temp.previous.next=temp.next;
				break;
			}
			temp = temp.next;
		}
		size--;
	}
	class MyIterator implements Iterator{
		Node temp = head ;
			public boolean hasNext(){
				return temp!=null;
			}
			public T next(){
				T val = (T)temp.data;
				temp = temp.next;
				return val;
			}
	}
	public Iterator <T> iterator(){
		MyIterator itr = new MyIterator();
		return itr;
	}
	public String toStringRev(){
		StringBuffer s = new StringBuffer();
		if(isEmpty()){
			return "[]";
		}
		Node temp = tail;
				while(temp!=null){
					s.append(temp.data);
					if(temp.previous !=null)
						s.append(",");
					else{
						s.insert(0,"[");
						s.append("]");
					}
					temp = temp.previous;
				}
		return s.toString();
	}
	public String toString(){
		StringBuffer s = new StringBuffer();
		if(isEmpty()){
			return "[]";
		}
		Node temp = head;
				while(temp!=null){
					s.append(temp.data);
					if(temp.next !=null)
						s.append(",");
					else{
						s.insert(0,"[");
						s.append("]");
					}
					temp = temp.next;
				}
		return s.toString();
	}
}
class Doublely {
	public static void main(String[] args){
		MyDoublely  list = new MyDoublely();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator itr = list.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(list.toString());
		System.out.println(list.toStringRev());
	}
}
