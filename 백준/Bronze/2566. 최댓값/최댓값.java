
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = -1;
		int x = 0;
		int y = 0;
		for (int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine() , " ");
			for (int j = 1; j <= 9; j++) {
				int tmpInt = Integer.parseInt(st.nextToken());
				if(tmpInt > max) {
					max = tmpInt;
					x = i;
					y = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(x+" "+y);
	}
}   