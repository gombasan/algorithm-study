import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int i =0; i < name.length; i++) {
			if(yearning.length > i) {
				map.put(name[i], yearning[i]);
			} else {
				map.put(name[i], 0);
			}
		}

		for(int i = 0; i < photo.length; i++) {
			int total = 0;
			for(int j = 0; j < photo[i].length; j++) {
				if(map.get(photo[i][j]) != null)
					total += map.get(photo[i][j]);
			}
			list.add(total);
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}