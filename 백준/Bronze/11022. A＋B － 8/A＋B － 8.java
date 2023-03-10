import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		for (int i = 1; i <= a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine() , " ");
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append("Case #"+i+": ").append(b+" + "+c +" = ").append(b+c).append("\n");
		}
		System.out.println(sb);
	}
}