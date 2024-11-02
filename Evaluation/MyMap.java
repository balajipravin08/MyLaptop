class MyMap{
	Node[] bucket ;
	int capacity = 16;
	int size =0;
		Node(int k , String v){
			int index=k%capacity;
			String value;
			Node next = null;
		}
	MyMap(){
		bucket=new Node[capacity];
	}
	public void put(int k , int v){
		Node newNode = new Node(k,v);
		
	}
}

