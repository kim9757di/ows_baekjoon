import java.io.*;
import java.util.*;

public class Main {
	public static int[] queue = new int[10000];
	public static int  SIZE=0;		//큐 사이즈 
	public static int FIRST=0;	//큐 처음 INDEX
	public static int LAST=-1;	//큐 마지막 INDEX 처음 PUSH할 경우를 생각해 최초 -1로 선언 
	
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			StringTokenizer st;

			int N = Integer.parseInt(br.readLine());
			
			while (N-- > 0) {
					st = new StringTokenizer(br.readLine() , " ");
				
					switch (st.nextToken()) {
						case "push":
							push(Integer.parseInt(st.nextToken()));
							break;
						case "pop":
							sb.append(pop()).append('\n');
							break;
						case "size":
							sb.append(size()).append('\n');
							break;	
						case "empty":
							sb.append(empty()).append('\n');
							break;
						case "front":
							sb.append(front()).append('\n');							
							break;
						case "back":
							sb.append(back()).append('\n');							
							break;
					}
			}
			System.out.println(sb.toString());
		}
		
		public static void push(int item) {
			LAST++;// 마지막 INDEX++ 
			queue[LAST] = item; //마지막 INDEX에 추가 
			SIZE++; 
		}
		public static int pop() {
			if(SIZE == 0) {
				return -1;
			}else {
				int popVal = queue[FIRST]; //처음 INDEX출력 
				queue[FIRST] = 0;// 처음 INDEX 초기화 
				FIRST++; //처음 INDEX++
				SIZE--;
				return popVal;
			}
			
		}
		public static int size() {
			return SIZE;
		}
		public static int empty () {
			if(SIZE==0) {
				return 1;
			}else {
				return 0;
			}
		}
		public static int front() {
			if(SIZE==0) {
				return -1;
			}else {
				return queue[FIRST];
			}
		}
		public static int back() {
			if(SIZE==0) {
				return -1;
			}else {
				return queue[LAST];
			}
		}
}