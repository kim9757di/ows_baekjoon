
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[][] APT = new int[15][15];
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1; // i층의 1호는 1명이 삼 
			APT[0][i] = i; // 0층의 i호는 i명이 삼 
		}
        
		for (int i = 1; i < 15; i++) { 
			for (int j = 2; j < 15; j++) { 
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
        
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			sb.append(APT[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append('\n');
		}
        
		System.out.println(sb);
	}
}