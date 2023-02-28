
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[5];
		StringBuilder sb = new StringBuilder();
		int N = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}

		while(N < 15) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].length() > N) {
					sb.append(arr[i].charAt(N));
				}
			}
			N++;
		}
		System.out.println(sb);
	}
} 