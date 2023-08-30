class Solution {
    public int solution(String s) {
		int answer = 0;
		
        String[] word = {"one","two","three","four","five","six","seven","eight","nine","zero"} ;
		String[] number = {"1","2","3","4","5","6","7","8","9","0"};
		
		
		for (int i =0; i<10; i++) {
			s= s.replaceAll(word[i], number[i]);
		}
		answer = Integer.parseInt(s);
		return answer;
    }
}