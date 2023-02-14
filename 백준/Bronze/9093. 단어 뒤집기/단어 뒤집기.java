import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // n 값 입력 
		Stack<Character> stack = new Stack<Character>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(n-- > 0) { // 첫번째 2 
				String input = br.readLine()+"\n"; // 한줄 읽어오면서 줄바꿈 
				for(char ch : input.toCharArray()) { 
						if(ch == ' '|| ch == '\n') { 
							// cahr 배열에서 공백이나 줄바꿈이 있을시 pop 실행 
								while(!stack.isEmpty()) { 
									// 스택에 비어있을때 true ~~> "!" 스택에 비어있을때 false
									bw.write(stack.pop());
									//bw :1olleh 2olleh 3olleh\n
								}
								bw.write(ch);// while 문 끝나고 출력 (공백이나 줄바꿈시)
						}else {
							// 공백이나 줄바꿈이 아닐 시 stack 에 push 실행  
							stack.push(ch);//{h,e,l,l,o,1} {h,e,l,l,o,2} {h,e,l,l,o,3}
						}
				}
		}
		bw.flush();
		return;
	}
	
	public void reverseAnswer() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // n 값 입력 
		StringBuilder answer = new StringBuilder();
		for(int i=0 ; i < n; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				StringBuilder sb = new StringBuilder(st.nextToken());
				answer.append(sb.reverse()+""); // ????
			}
			answer.append("\n");
		}
		System.out.print(answer);
		
	}

}