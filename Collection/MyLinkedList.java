class MyException extends Exception{
	MyException(){}
	MyException(String s){
		super(s);
	}
}
class MyLinkedList implements Iterable{
	Node head;
	private int size ; 
	
	class Node{
		Integer data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	MyLinkedList(){
		head = null;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0)
		return true;
		
		return false;
	}
	public void insertAtBeginning (int data){
		Node newNode = new Node(data);
		//when list is empty
		if(isEmpty()){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	public void add(int data){
		Node newNode = new Node(data);
		Node temp = head;
			if(isEmpty())
				head=newNode;
			else{
				while(temp.next!=null){
					temp = temp.next;
			}
		temp.next=newNode;
		}
		size++;
	}
	public void insertAtPos(int pos ,int data ) throws MyException{
		if(pos==0){
			insertAtBeginning(data);
			return;
		}
		if(pos>size){
			throw new MyException("Invalid Position");
		}
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=1;i<pos;i++){
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next= newNode;
		size++;
	}
	public void removeFirst() throws MyException{
		if(isEmpty()){
			throw new MyException("No Such Element");
		}
		 head = head.next;
		 size--;
	}
	public void remove(int pos) throws MyException {
		if(pos==0){
			removeFirst();
			return;
		}
		if(pos>size){
			throw new MyException("Invalid Position");
		}
		Node temp = head;
		for(int i=1;i<pos;i++){
			temp = temp.next;
		}
		Node temp2 = temp.next;
		temp.next=temp2.next;
		size--;
		
	}
	public void removeLast()throws MyException{
		Node temp = head ;
		if(isEmpty()){
			throw new MyException("No Such Element");
		}
		else{
			for(int i=1;i<size-1;i++){
					temp = temp.next;
			}
			temp.next=null;
		}
		size--;
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

class Demo {
	public static void main(String[] args) throws MyException{
		MyLinkedList  list = new MyLinkedList();
		list.add(10);
		list.add(29);
		list.removeLast();
		list.removeLast();
		list.removeLast();
		System.out.println(list);
		
	}
} 
