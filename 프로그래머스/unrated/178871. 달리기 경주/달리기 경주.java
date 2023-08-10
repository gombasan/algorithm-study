import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
		Map<String, Integer> hashMap = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			hashMap.put(players[i], i);
			map.put(i, players[i]);
		}

		for (int i = 0; i < callings.length; i++) {
			int a = hashMap.get(callings[i]);
			String s = map.get(a - 1);
			hashMap.put(callings[i], a-1);
			hashMap.put(s, a);
			map.put(a, s);
			map.put(a - 1, callings[i]);
		}

		return map.values().toArray(answer);
    }
    
}