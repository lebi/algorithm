package _205_IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sM = new HashMap<>();
        Map<Character, Integer> tM = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            Integer si = sM.get(sc);
            Integer ti = tM.get(tc);
            if(si == null){
                if(ti == null){
                    sM.put(sc, i);
                    tM.put(tc, i);
                }else
                    return false;
            }else{
                if(ti == null)
                    return false;
                if(si.intValue() != ti){
                    return false;
                }
            }
        }
        return true;
    }
}
