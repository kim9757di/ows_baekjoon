import java.io.*;
import java.util.*;

public class Main {

		public static void main(String[] args)throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			// 입력받을 라인 개수 지정 
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				sb.append(solve(br.readLine())).append("\n");
			}
			System.out.println(sb);
		}
		
		public static String solve(String s) {
			Stack<Character> stack = new Stack<>();
			for(int i = 0 ; i < s.length(); i++) {
					char c = s.charAt(i);
					if(c == '(') {
						stack.push(c);
					}else if(stack.isEmpty()) {
						return "NO";
					}else {
						stack.pop();
					}
			}//포문 끝 
			
			if(stack.empty()) {
				return "YES";
			}else {
				return "NO";
			}
		}
}