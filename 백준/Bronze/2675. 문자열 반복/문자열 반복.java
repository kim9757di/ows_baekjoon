import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine()," ");
    		int R = Integer.parseInt(st.nextToken());
    		String arr = st.nextToken();
    		for (int i = 0; i < arr.length(); i++) {
    			for (int j = 0; j < R; j++) {
    				sb.append(arr.charAt(i));
				}
    		}
    		sb.append('\n');
		}
		System.out.println(sb);
	}
}    