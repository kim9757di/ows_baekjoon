class Solution {
    public int solution(int n) {
        int answer = 0;
        int value = 1;
        for (int i = 1; i <= 10; i++) {
        	value *= i; 
			if(value == n) {
				answer = i;
				break;
			}else if(value > n) {
				answer = i-1;
				break;
			}
		}
        return answer;
    }
}