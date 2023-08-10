class Solution {
	public static int[] solution(String[] park, String[] routes) {
		int[] answer = {};
		char[][] map = new char[park.length][];
		int x = 0;
		int y = 0;
		for(int i = 0; i < park.length; i++) {
			map[i] = park[i].toCharArray();
		}

		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(map[i][j] == 'S') {
					x = j;
					y = i;
					break;
				}
			}
		}
		for(String route : routes) {
			String[] s = route.split(" ");
			String op = s[0];
			int num = Integer.parseInt(s[1]);
			int Xcount = x;
			int Ycount = y;
			switch(op) {
				case "E" :
					for(int i = 1; i <= num; i++) {
						if(x+i >= map[y].length){
							Xcount = x;
							break;
						} else if(map[y][x+i] == 'X') {
							Xcount = x;
							break;
						} else {
							Xcount ++;
						}
					}
					x = Xcount;
					break;
				case "W" :
					for(int i = 1; i<=num; i++) {
						if(x-i < 0) {
							Xcount = x;
							break;
						} else if(map[y][x-i] == 'X') {
							Xcount = x;
							break;
						} else {
							Xcount --;
						}
					}
					x = Xcount;
					break;
				case "S" :
					for(int i = 1; i <= num; i++) {
						if(y+i >= map.length){
							Ycount = y;
							break;
						} else if(map[y+i][x] == 'X') {
							Ycount = y;
							break;
						} else {
							Ycount ++;
						}
					}
					y = Ycount;
					break;
				case "N" :
					for(int i = 1; i<= num; i++) {
						if(y-i < 0) {
							Ycount = y;
							break;
						} else if(map[y-i][x] == 'X') {
							Ycount = y;
							break;
						} else {
							Ycount --;
						}
					}
					y = Ycount;
					break;
			}

		}
		int[] result = {y,x};
		return result;
	}
}