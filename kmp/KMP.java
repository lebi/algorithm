package kmp;

public class KMP {
	public char[] parent;
	public char[] child;
	private int[] fail;
	
	public void failure(){
		fail=new int[child.length];
		fail[0]=-1;
		for(int i=1;i<fail.length;i++){
			int before=fail[i-1];
			while(true){
				if(child[before+1]==child[i]){
					fail[i]=before+1;
					break;
				}else if(before==-1){
					fail[i]=-1;
					break;
				}else 
					before=fail[before];
			}
		}
	}
	
	public int compare(){
		failure();
		int ci=0;
		int pi=0;
		while(true){
			if(ci==child.length) return pi-ci;
			if(pi==parent.length) return -1;
			
			if(parent[pi]==child[ci]){
				pi++;
				ci++;
			}else{
				ci=fail[ci];
				ci++;
				if(ci==0) pi++;
			}
		}
	}
	
	public static void main(String[] args){
		String p="abcmdacabacabcdabcmabcdbaadmcadma";
		String c="abcdabcmabcd";
		KMP kmp=new KMP();
		kmp.parent=p.toCharArray();
		kmp.child=c.toCharArray();
		System.out.println(kmp.compare());
	}
}
