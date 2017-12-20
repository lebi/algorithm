package _201_BitwiseANDofNumbersRange;

/**
 * Created by hzhuangyan1 on 2017/12/20.
 */
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int cha = n - m;
        int a = 0xffffffff;
        while(cha > 0){
            cha >>>= 1;
            a <<= 1;
        }
        return n & m & a;
    }
}