
import java.io.*;
import java.util.*;

public class Main {
	
	public static boolean arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		arr = new boolean[N+1];
		get_prime();
		
		// 소수 합 및 최솟값 
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		
		
		for(int i = M; i <= N; i++) {
			if(arr[i] == false) {	// false = 소수 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임  
					min = i;
				}
			}
		}
		
		if(sum == 0) {	// 소수가 없다면 
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	// 에라토스테네스 체 알고리즘 
	public static void get_prime() {
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) {
				continue;	
			}
			for(int j = i * i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
		
	}
}