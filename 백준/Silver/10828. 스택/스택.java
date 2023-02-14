
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[]STACK = new int[N];
		int SIZE = 0;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
				case "push":
						STACK[SIZE] = Integer.parseInt(st.nextToken());
						SIZE++;
						break;
				case "pop":
    					if(SIZE == 0) {
    						sb.append(-1).append("\n");
    					} else {
    						int result = STACK[SIZE-1];
    						STACK[SIZE-1] = 0;
    						SIZE--;
    						sb.append(result).append("\n");
    					}
						break;	
				case "size":
						sb.append(SIZE).append("\n");
						break;	
				case "empty":
    					if(SIZE == 0) {
    						sb.append(1).append("\n");
    					}else {
    						sb.append(0).append("\n");
    					}
						break;
				case "top":
    					if(SIZE == 0) {
    						sb.append(-1).append("\n");
    					}else {
    						sb.append(STACK[SIZE-1]).append("\n");
    					}
						break;
			}
		}
		System.out.println(sb);
	}
}