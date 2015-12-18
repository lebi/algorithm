package uniquebrinarysearchtreeII;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
	List<TreeNode> res=new ArrayList<>();
    public List<TreeNode> generateTrees(int n) {
    	if(n==0){
    		List<TreeNode> list=new ArrayList<>();
    		list.add(null);
    		return list;
    	}
        return create(1,n);
    }
    
    public List<TreeNode> create(int a,int b){
    	if(a==b){
    		List list=new ArrayList();
    		list.add(new TreeNode(a));
    		return list;
    	}
		List<TreeNode> list=new ArrayList<>();
    	for(int i=a;i<=b;i++){
    		List<TreeNode> ls=create(a,i-1);
    		List<TreeNode> rs=create(i+1,b);
    		if(ls.size()==0&&rs.size()!=0){
    			for(TreeNode n:rs){
    				TreeNode node=new TreeNode(i);
    				node.right=n;
    				list.add(node);
    			}
    		}else if(ls.size()!=0&&rs.size()==0){
    			for(TreeNode l:ls){
    				TreeNode node=new TreeNode(i);
    				node.left=l;
    				list.add(node);
    			}
    		}else if(ls.size()!=0&&rs.size()!=0){
    			for(TreeNode l:ls){
    				for(TreeNode r:rs){
    					TreeNode node=new TreeNode(i);
        				node.left=l;
        				node.right=r;
        				list.add(node);
    				}
    			}
    		}
    	}
    	return list;
    }
}