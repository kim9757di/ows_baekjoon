
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine() , " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
			a--;
		}
		System.out.println(sb);
	}
}