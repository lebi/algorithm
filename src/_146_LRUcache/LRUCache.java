package _146_LRUcache;

import sun.misc.FDBigInteger;

import javax.swing.text.AbstractDocument;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LRUCache {
	private Set<Integer> keys;
	private int capacity;
	private int len=0;
	LRUNode head;

    public LRUCache(int capacity) {
        keys=new HashSet<>();
        this.capacity=capacity;
    }
    
    public int get(int key) {
		if (!keys.contains(key))
        	return -1;
		int value;
		if (head.key==key){
			return head.value;
		}
		LRUNode prev=head;
		for (LRUNode it=prev.next;it!=null;prev=it,it=it.next){
			if (it.key==key){
				value=it.value;
				prev.next=it.next;
				it.next=head;
				head=it;
				return value;
			}
		}
		return -1;
    }
    
    public void set(int key, int value) {
		if (capacity<=0) return;
		if (!keys.contains(key)){
			keys.add(key);
			if (len<capacity){
				LRUNode node=new LRUNode(key,value);
				node.next=head;
				head=node;
				len++;
				return;
			}else {
				LRUNode it;
				for (it=head;it.next!=null;it=it.next){
				}
				keys.remove(it.key);
				it=null;
				LRUNode node=new LRUNode(key,value);
				node.next=head;
				head=node;
				return;
			}
		}else{
			if (head.key==key){
				head.value=value;
				return;
			}

			LRUNode prev=head;
			for (LRUNode it=prev.next;it!=null;prev=it,it=it.next){
				if (it.key==key){
					it.value=value;
					prev.next=it.next;
					it.next=head;
					head=it;
					return;
				}
			}
		}

//    	if(map.containsKey(key)){
//    		map.get(key).value=value;
//    		map.get(key).count=0;
//    	}else{
//    		if(len<capacity){
//    			map.put(key, new LRUData(value));
//    			len++;
//    		}else{
//    			Set<Integer> set=map.keySet();
//    			Iterator<Integer> it=set.iterator();
//    			while(it.hasNext()){
//    				int k=it.next();
//    				if(map.get(k).count==capacity){
//    					map.remove(k);
//    					break;
//    				}
//    			}
//    			map.put(key, new LRUData(value));
//    		}
//    	}
//		Set<Integer> set=map.keySet();
//		Iterator<Integer> it=set.iterator();
//		while(it.hasNext()){
//			map.get(it.next()).add(capacity);
//		}
    }
}

class LRUData{
	int count=0;
	int value;
	
	public LRUData(int value){
		this.value=value;
	}
	
	void add(int cap){
		if(count<cap) count++;
	}
}

class LRUNode{
	int key;
	int value;
	LRUNode next;
	public LRUNode(int key,int value){
		this.key=key;
		this.value=value;
	}
}