package _151_ReverseWordsinaString;

/**
 * Created by hzhuangyan1 on 2017/12/24.
 */
public class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        if(arr.length == 0)
            return s;
        reverse(arr, 0, arr.length - 1);
        int len = 0;
        boolean word = false;
        int begin = 0;
        for(int i =0;i < arr.length;i++){
            if(arr[i] != ' '){
                len++;
                word = true;
            }else{
                if(word){
                    reverse(arr, begin, i - 1);
                    begin = begin + len + 1;
                    len = 0;
                    word = false;
                }
            }
        }
        if(word){
            reverse(arr, begin, arr.length - 1);
        }
        int e = arr.length;
        for(int i = arr.length - 1;i >= 0;i--){
            if(arr[i] == ' '){
                e = i;
            }else
                break;
        }
        return new String(arr, 0, e);
    }

    public void reverse(char[] arr, int s, int e) {
        while(e >= s){
            char t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;e--;
        }
    }
}