import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		Stack<Character> leftStack = new Stack<>();
		Stack<Character> rightStack = new Stack<>();
		
		
		for(char c : str.toCharArray()) {
			leftStack.push(c);
		}
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			String cmd = br.readLine();
			switch (cmd.charAt(0)) {
					case 'L' : 
						// 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
						if(leftStack.empty()) break;
						rightStack.push(leftStack.pop());
						break;
					case 'D':
						//커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
						if(rightStack.empty()) break;
						leftStack.push(rightStack.pop());
						break;
					case 'B':
						//커서 왼쪽에 있는 문자를 삭제함(커서가 문장의 맨 앞이면 무시됨)
						//삭제로 인해 커서는 한 칸 왼쪽으로 이동한것처럼 나타나지만, 실제로 커서의 올느쪽에 있던 문자는 그대로임
						if(leftStack.empty()) break;
						leftStack.pop();
						break;
					case 'P':
						//P공백 이후 문자를 커서 왼쪽에 추가함
						leftStack.push(cmd.charAt(2));
						break;
				}
			
		}
		
		while(!leftStack.empty()) {	//leftStack 전부 rightStack으로 옮기기  
			rightStack.push(leftStack.pop());
		}
		while(!rightStack.empty()) { //rightStack 전부 append 
			sb.append(rightStack.pop());
		}
		
		System.out.println(sb.toString());// 출력 
	}
}