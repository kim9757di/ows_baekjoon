import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());  //시작
			int J = Integer.parseInt(st.nextToken());  //끝 
			for (int i = I; i <= J; i++) {
				int tmpInt = arr[i];
				arr[i]	 = arr[J];
				arr[J--] = tmpInt;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
	}
}    