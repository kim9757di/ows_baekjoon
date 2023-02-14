import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Queue<Integer> myQ = new LinkedList<>();
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			for (int i = 1; i <= N; i++) {
				myQ.offer(i);
			}
			
			//System.out.println("myQ :: "+myQ);
			
			sb.append("<");
			// 1일때 까지 
			while (myQ.size() != 1) {
				for (int i = 0; i < K-1; i++) {
					//1번째 1, 2 
					//2번째 4,5
					//3번째 7,1
					//4번째 4,5
					//5번째 1,4
					//6번째 1
					 myQ.offer(myQ.poll());
				}
				sb.append(myQ.poll()+", "); //3 출력 6 출력 2출력 
			}
			sb.append(myQ.poll()).append(">");
			System.out.println(sb.toString());
	}
}