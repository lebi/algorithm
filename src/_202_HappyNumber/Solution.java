package _202_HappyNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hzhuangyan1 on 2017/12/20.
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            if(n == 1)
                return true;
            if(set.contains(n))
                return false;
            set.add(n);
            int sum = 0;
            while(n > 0){
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isHappy(3);
    }
}
