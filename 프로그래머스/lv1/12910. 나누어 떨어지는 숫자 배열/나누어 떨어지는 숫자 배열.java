import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
      	int[] tmp_answer = new int[arr.length];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				tmp_answer[cnt++] = arr[i];
			}
		}
        
        if(cnt == 0) {
        	return new int[]{-1};
        }
        
        
        int[] answer = new int[cnt];
        
        for (int i = 0; i < cnt; i++) {
        	answer[i] = tmp_answer[i];
        }
        
        Arrays.sort(answer);
        return answer;
    }
}