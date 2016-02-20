package _133_cloneGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UndirectedGraphNode {
     int label;
     List<UndirectedGraphNode> neighbors;
     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 };

public class Solution {
	Map<Integer, UndirectedGraphNode> map=new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	if(node==null)return null;
    	UndirectedGraphNode res=new UndirectedGraphNode(node.label);
        map.put(node.label, res);
        dfs(node,res);
        return res;
    }
    
    void dfs(UndirectedGraphNode a,UndirectedGraphNode b){
		map.put(b.label, b);
    	for(UndirectedGraphNode i:a.neighbors){
    		UndirectedGraphNode tmp;
    		if(!map.containsKey(i.label)){
    			tmp=new UndirectedGraphNode(i.label);
    		}else
    			tmp=map.get(i.label);
    		b.neighbors.add(tmp);

    		if(!map.containsKey(i.label)){
    			dfs(i,tmp);
    		}
    	}
    }
}