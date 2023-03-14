
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			int starCnt = (i*2)-1;
			for (int j = (N-i); j > 0; j--) {
				sb.append(" ");
				
			}
			
			for (int k = starCnt; k > 0; k--) {
				sb.append("*");
			}
			sb.append('\n');
		}
		
		for (int i = (N-1); i > 0; i--) {
			int starCnt = (i*2)-1;
			for (int j = 0; j < (N-i); j++) {
				sb.append(" ");
				
			}
			
			for (int k = 0; k < starCnt; k++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}    