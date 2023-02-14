
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
        
		do {
			//십의자리 + 일의자리 
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			//System.out.print((N % 10) * 10 + " + ");
			//System.out.print((N / 10)+ " + ");
			//System.out.print((N % 10)% 10 + " = ");
			//System.out.println(N);
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
	}
}