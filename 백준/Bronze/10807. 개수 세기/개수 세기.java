import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine() , " ");
		String findNum = br.readLine();
		int cnt = 0;
		
		while(N > 0) {
			if(findNum.equals(st.nextToken())) {
				cnt++;
			}
			N--;
		}
		System.out.println(cnt);
	}
}