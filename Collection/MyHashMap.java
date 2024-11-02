import java.util.Objects;

class MyHashMap<K,V> {

    private HashNode[] buckets;
    private int size;
    private int noOfBuckets;
    private Node head;

    private class HashNode<K,V> {
        K key ;
        V value ;
        HashNode next;

        HashNode(K key , V value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }
    MyHashMap(){this(10);}

    MyHashMap(int capacity){
        noOfBuckets = capacity;
        buckets = new HashNode[capacity];
        size =0;
        head = null;
    }
        private class Node<K>{
        K data ;
        Node next;

        	Node(K data){
 		this.data=data;
		 next = null;
        	}
    }

    public int getSize(){
        return size;
    }
   
    public boolean isEmpty(){
        return size == 0;
    }

    private int getBucketIndex(K key){
        if(key == null) return 0;
        int hashcode = key.hashCode();
        int index = Math.abs(hashcode) % noOfBuckets;
        return index;
    }
    public void put(K key , V value){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head!=null) {
            if(Objects.equals(head.key,key)){
                head.value=value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode newNode = new HashNode<K,V>(key, value);
        newNode.next=head;
        buckets[bucketIndex] = newNode;
        if (this.head == null) {
            this.head = new Node(key);
        }else{
            Node temp = this.head;	
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next = new Node(key);
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Node temp = head;
        while(temp!=null){
                 int bucketIndex = getBucketIndex((K) temp.data);
                 HashNode hashNode = buckets[bucketIndex];
                 while(hashNode!=null){
                       if(Objects.equals(hashNode.key, temp.data)){
                              sb.append(hashNode.key).append("=").append(hashNode.value).append(",");
                              break;
                       }
                       hashNode = hashNode.next;
                 }
                 temp = temp.next;
        }
        sb.append("}");
        return sb.toString().trim();
 }	

}
class DemoMap{
	public static void main(String[] args){
		MyHashMap<Integer,String> map = new MyHashMap<>();
		map.put(1,"hi");
		map.put(1,"hio");
		System.out.println(map);
	}
}
