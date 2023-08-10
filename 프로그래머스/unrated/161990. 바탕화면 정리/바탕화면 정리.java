class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        boolean [][] map = new boolean[wallpaper.length][];
        
        for(int i = 0; i < wallpaper.length; i++) {
            char[] ch = wallpaper[i].toCharArray();
            boolean[] temp = new boolean[ch.length];
            for(int j = 0; j < ch.length; j ++) {
                if(ch[j] == '#') {
                    temp[j] = true;
                } else {
                    temp[j] = false;
                }
            }
            map[i] = temp;
        }
        
        int lux = 50;
        int luy = 50;
        int rdx = 0;
        int rdy = 0;

        
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j] == true) {
                    if(lux >= j) {
                        lux = j;
                    }
                    if(rdx <= j) {
                        rdx = j;
                    }
                    
                    if(luy >= i) {
                        luy = i;
                    }
                    if(rdy <= i) {
                        rdy = i;
                    }
                }
            }
        }
        
        int[] result = {luy,lux,rdy+1,rdx+1};
        answer = result;
        return answer;
    }
}