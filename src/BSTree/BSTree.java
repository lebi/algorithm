package BSTree;

public class BSTree {
	public Node root=new Node();
	public int count=0;
	
	public void push(int a){
		if(count==0){
			root.setValue(a);
			count++;
			return;
		}
		Node it;
		Node p=root;
		for(it=root;it!=null;){
			p=it;
			if(a>it.getValue())
				it=it.right;
			else
				it=it.left;
		}
		if(a>p.getValue()){
			p.right=new Node();
			p.right.setValue(a);
		}else{
			p.left=new Node();
			p.left.setValue(a);
		}
		
	}
	
	public void firstSearch(Node node){
		if(node==null)
			return;
		System.out.println(node.getValue());
		firstSearch(node.left);
		firstSearch(node.right);
	}
	
	public void lastSearch(Node node){
		if(node==null)
			return;
		lastSearch(node.left);
		lastSearch(node.right);
		System.out.println(node.getValue());
	}

	public void middleSearch(Node node){
		if(node==null)
			return;
		middleSearch(node.left);
		System.out.println(node.getValue());
		middleSearch(node.right);
	}
	
	public static void main(String[] args){
		BSTree tree=new BSTree();
		tree.push(3);
		tree.push(1);
		tree.push(2);
		tree.push(5);
		tree.push(4);
		tree.push(6);
		tree.middleSearch(tree.root);
	}
}

class Node{
	public Node right;
	public Node left;
	private int value;
	public Node(){
		right=null;
		left=null;
		setValue(-1);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}