package _75_sortcolors;

import java.util.Arrays;

public class Solutiuon {
    public void sortColors(int[] nums) {
        int head=0,end=nums.length-1;
        int i=0;
        while(i<=end&&head<=end){
        	i=head>i?head:i;
            if(nums[i]==0)
            	swap(nums,head++,i);
            else if(nums[i]==2)
            	swap(nums,end--,i);
            else i++;
            while(head<end&&nums[head]==0)
            	head++;
            while(end>head&&nums[end]==2)
            	end--;
        }
        System.out.println(Arrays.toString(nums));
    }
    void swap(int[] arr,int i,int j){
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }    
    public static void main(String[] arg){
    	Solutiuon so=new Solutiuon();
    	so.sortColors(new int[]{0,1,2,0,1,2,0,1});
    }
}
