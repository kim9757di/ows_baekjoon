class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int[] tmp_board = {-(board[0]/2),(board[0]/2),(board [1]/2),-(board [1]/2)};//left , right , up , down   
        for (int i = 0; i < keyinput.length; i++) {
			if("left".equals(keyinput[i])&&(tmp_board[0] < answer[0])) {
				answer[0]--;
			}else if("right".equals(keyinput[i])&&(tmp_board[1] > answer[0])) {
				answer[0]++;
			}else if("up".equals(keyinput[i])&&(tmp_board[2] > answer[1])) {
				answer[1]++;
			}else if("down".equals(keyinput[i])&&(tmp_board[3] < answer[1])) {
				answer[1]--;
			}
		}
        return answer;
    }
}