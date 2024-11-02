class MyLinkedList {
	Node head;
	int size=0;
	class Node{
		int data;
		Node next;
		
			Node(int val){
				data = val;
				next = null;
			}
	}
	MyLinkedList(){
		head = null;
	}
	
	public void add(int val){
		Node newNode = new Node(val);
		Node temp = head;
		if(head==null){
			head=newNode ;
		}
		else{
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = newNode;
			
		}
		size++;
	}
	public String toString(){
		Node temp = head;
		String s = "";
		for(int i=0;i<size;i++){
			s= s+temp.data + ",";
			temp = temp.next;
		}
		return s;
		
	}
}
class DemoList{
	public static void main(String[] args){
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
	}
}
