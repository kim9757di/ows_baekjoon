class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        boolean flag = true;
        for (int i = 0; i < A.length(); i++) {
        	if(A.equals(B)) {
        		answer = i;
        		flag = false;
        		break;
        	}
        	A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
        }
        
        if(flag) {
        	answer = -1;
        }
        return answer;
    }
}