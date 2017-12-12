package _179_largestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hzhuangyan1 on 2017/12/12.
 */
public class _179largestNumber {

    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>(nums.length);
        for (int i : nums){
            list.add(i + "");
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] c1 = (o1 + o2).toCharArray();
                char[] c2 = (o2 + o1).toCharArray();
                for (int i =0; i < c1.length; i++){
                    if (c1[i] > c2[i]) // o1 bigger
                        return -1;
                    if (c1[i] < c2[i]) // o2 bigger
                        return 1;
                }
                return 0;
            }
        });
        StringBuilder builder = new StringBuilder();
        for (String i : list){
            builder.append(i);
        }
        if (builder.length() > 0 && builder.charAt(0) == '0')
            return "0";
        return builder.toString();
    }
}
