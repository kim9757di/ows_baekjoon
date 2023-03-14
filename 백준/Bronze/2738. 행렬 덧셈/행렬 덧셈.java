import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine() , " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M] ;  // 3 ,3
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine() , " ");
				for (int k = 0; k < M; k++) {
					arr[j][k] += Integer.parseInt(st.nextToken());
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}    