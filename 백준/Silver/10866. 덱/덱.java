import java.io.*;
import java.util.*;

public class Main {
	public static int[] DEQUE  = new int[10000];
	public static int SIZE =0;
	public static int FRONT=0;
	public static int BACK =0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;

		int N = Integer.parseInt(br.readLine());
		
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			switch (st.nextToken()) {
					case "push_front":
						push_front(Integer.parseInt(st.nextToken()));
						break;
					case "push_back":
						push_back(Integer.parseInt(st.nextToken()));
						break;	
					case "pop_front":
						sb.append(pop_front()).append('\n');	
						break;	
					case "pop_back":
						sb.append(pop_back()).append('\n');	
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
	
	public static void push_front(int x) {
		//원소를 먼저 넣은 뒤 FRONT 감소 
		DEQUE[FRONT] = x;
		//음수가 되지 않도록 배열 크기만큼 더해준다.
		FRONT= (FRONT-1+10000)%10000;
		SIZE++;
	}
	public static void push_back(int x) {
		/*
		 * DEQUE[9999] 까지 꽉 찼을 경우 0으로 가르키기 위해 
		 *   배열 크기만큼 나눠 나머지를 구한다.
		 */
		BACK=(BACK+1)%10000;
		SIZE++;
		DEQUE[BACK] = x;
	}
	public static int pop_front() {
		if(SIZE== 0) {
			return -1;
		}else{
			/*
			 * FRONT+1이 FRONT 원소이므로 해당 원소를 임시 변수에 둔 뒤 
			 * FRONT를 1 증가시킨다 
			 * */
			int tmpVal = DEQUE[(FRONT+1)%10000];
			FRONT= (FRONT+1)%10000;
			SIZE--;
			return tmpVal;
		}
	}
	public static int pop_back() {
		if(SIZE ==0) {
			return -1;
		}else {
			int tmpVal = DEQUE[BACK];
			BACK= (BACK-1+10000)%10000;
			SIZE--;
			return tmpVal;
		}
	}
	public static int size() {
		return SIZE;
	}
	public static int empty() {
		if(SIZE == 0) {
			return 1;
		}else {
			return 0;
			
		}
	}
	public static int front() {
		if(SIZE== 0) {
			return -1;
		}else {
			return DEQUE[(FRONT+1)%10000];
		}
	}
	public static int back() {
		if(SIZE== 0) {
			return -1;	
		}else {
			return DEQUE[BACK];
		}
	}
}
