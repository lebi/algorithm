package _190_reverseBits;

/**
 * Created by hzhuangyan1 on 2017/12/12.
 */
public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res << 1 | (n & 1);
            n = n >> 1;
        }
        return res;
    }
}
