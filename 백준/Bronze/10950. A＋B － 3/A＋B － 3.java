import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(a > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append(b+c).append("\n");
			a--;
		}
		System.out.println(sb);
	}
}