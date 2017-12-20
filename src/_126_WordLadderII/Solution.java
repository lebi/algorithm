package _126_WordLadderII;

import java.util.*;

/**
 * Created by hzhuangyan1 on 2017/12/20.
 */
class Solution {
    int count = 0;
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Queue<List<String>> listQueue = new LinkedList<>();
        listQueue.add(Collections.singletonList(beginWord));
        boolean end = false;
        while (!listQueue.isEmpty()) {
            count++;
            int s = listQueue.size();
            for (int i=0; i < s; i++) {
                List<String> list = listQueue.poll();
                for(String w : wordList){
                    if (list.contains(w))
                        continue;
                    if(check(list.get(list.size() - 1),w)){
                        if(w.equals(endWord)){
                            List<String> stringList = new ArrayList<>(list);
                            stringList.add(w);
                            result.add(stringList);
                            end = true;
                        }else {
                            List<String> stringList = new ArrayList<>(list);
                            stringList.add(w);
                            listQueue.offer(stringList);
                        }
                    }
                }
            }
            if (end)
                break;
        }
        return result;
    }


    public boolean check(String wa, String wb) {
        int c = 0;
        for (int i = 0; i < wa.length(); i++) {
            if (wa.charAt(i) != wb.charAt(i)) {
                c++;
            }
        }
        return c == 1;
    }

}