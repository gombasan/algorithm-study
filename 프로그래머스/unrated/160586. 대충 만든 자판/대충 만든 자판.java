import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character,Integer> map = new HashMap<>();
        for(String key : keymap) {
            char[] ch = key.toCharArray();
            for(int i = 0; i < ch.length; i++) {
                if(map.containsKey(ch[i])) {
                    int min = Math.min(map.get(ch[i]) , i);
                    map.put(ch[i], min);
                }
                else {
                    map.put(ch[i],i);
                }
                
            }
                
        }
        
        for(int i = 0; i < targets.length; i ++) {
            int total = 0;
            char[] ch = targets[i].toCharArray();
            for(int j = 0; j < ch.length; j ++ ) {
                if(map.get(ch[j]) == null) {
                    total = -1;
                    break;
                }
                total += (map.get(ch[j]) + 1);
            }
            answer[i] = total;
        }
        
        return answer;
    }
}