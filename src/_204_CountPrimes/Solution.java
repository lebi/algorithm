package _204_CountPrimes;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int c = 0;
        for(int i = 2; i < n; i++){
            if(!prime[i]){
                c ++;
                for(int j = 2; j * i < n; j++){
                    prime[i * j] = true;
                }
            }
        }
        return c;
    }
}
