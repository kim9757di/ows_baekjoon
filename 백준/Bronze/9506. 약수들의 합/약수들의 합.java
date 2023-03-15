
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		while((N = Integer.parseInt(br.readLine())) != -1) {
			int sum = 0; 
			StringBuilder sb = new StringBuilder();
			
			sb.append(N+" = ");
			for (int i = 1; i < N; i++) {
				if(N%i == 0) {
					sb.append(i +" + ");
					sum += i;
				}
			}
			
			if(sum == N) {
				System.out.println(sb.substring(0 , sb.length()-2));
			} else {
				System.out.println(N +" is NOT perfect.");
			}
		}
	}
}    