package _146_LRUcache;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LRUCache {
	private Map<Integer, LRUData> map;
	private int capacity;
	private int len=0;
	
    public LRUCache(int capacity) {
        map=new HashMap<>();
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        	return map.get(key).value;
        return -1;
    }
    
    public void set(int key, int value) {
    	if(map.containsKey(key)){
    		map.get(key).value=value;
    		map.get(key).count=0;
    	}else{
    		if(len<capacity){
    			map.put(key, new LRUData(value));
    			len++;
    		}else{
    			Set<Integer> set=map.keySet();
    			Iterator<Integer> it=set.iterator();
    			while(it.hasNext()){
    				int k=it.next();
    				if(map.get(k).count==capacity){
    					map.remove(k);
    					break;
    				}
    			}
    			map.put(key, new LRUData(value));
    		}
    	}
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){
			map.get(it.next()).add(capacity);
		}
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