package _146_LRUcache;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache {
	private Set<Integer> keys;
	private int capacity;
	private int len = 0;
	Node head;
	Node tail;
	Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
		Node node;
		if ((node = getNode(key)) == null)
			return -1;
		return node.value;
    }

	public Node getNode(int key) {
		Node node = map.get(key);
		if (node != null) {
			if (node == tail)
				return node;
			deleteNode(node);
			addLast(node);
		}
		return node;
	}

	private void addLast(Node n){
		if (tail == null){
			head = n;
		}else {
			tail.next = n;
		}
		n.prev = tail;
		n.next = null;
		tail = n;
	}

	private void deleteNode(Node node){
		if (node == head){
			head = node.next;
			head.prev = null;
		}else {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
	}
    
    public void put(int key, int value) {
		Node node;
		if ((node = getNode(key))!= null ){
			node.value = value;
			return;
		}
		if (capacity == 0)
			return;
		if (capacity == len){
			//delete first
			map.remove(head.key);
			if (head == tail){
				head = null;
				tail = null;
			}else {
				head.next.prev = null;
				head = head.next;
			}
		}else
			len ++;
		node = new Node(key, value);
		addLast(node);
		map.put(key, node);
    }

	class Node{
		private Node prev;
		private Node next;
		private int key;
		private int value;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1,1);
	}
}
