class MyDouble {

	private Node head;
	private Node tail;
	private int size =0;
		private class Node{
			private int data;
			private Node next;
			private Node prev;
			
				Node(int val){
					data = val;
					next = null;
					prev=null;
				}

			
		}
		MyDouble(){
			head = null;
			tail = null;
		}
		
		public void addFirst(int val){
			Node newNode = new Node(val);
			newNode.next = head;
			if(head ==null){
				tail = newNode;
			}
			else{
				head.prev = newNode;
			}
			head = newNode;
			size++;
		}
		public void addLast(int val){
			Node newNode = new Node(val);
			newNode.prev = tail;
			if(tail==null){
				head = newNode;
			}
			else{
				tail.next=newNode;
			}
			tail=newNode;
			size++;
		}
		public String toString(){
			Node temp = head;
			String s = "";
			for(int i=0;i<size;i++){
				s=s+temp.data+",";
				temp = temp.next;
			}
			return s;
		}
		
}
class DemoDouble {
	public static void main(String[] args){
		MyDouble list = new MyDouble();
		list.addFirst(10);
		list.addFirst(30);
		list.addLast(20);
		list.addLast(50);
		System.out.println(list);
	}
}
