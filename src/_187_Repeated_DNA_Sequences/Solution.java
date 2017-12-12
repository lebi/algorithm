package _187_Repeated_DNA_Sequences;

import java.util.*;

/**
 * Created by hzhuangyan1 on 2017/12/12.
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 10; i < s.length() ;i++){
            String str = s.substring(i-10,i);
            if (map.containsKey(str))
                map.put(str, 1);
            else
                map.put(str, 0);
        }

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()){
            if (e.getValue() > 0)
                res.add(e.getKey());
        }
        return res;
    }
}
