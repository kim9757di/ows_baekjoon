import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		for (int i = a; i > 0; i--) {
			for (int j = 1; j <= a; j++) {
				if(j < i) {
					sb.append(" ");
				}else {
					sb.append("*");
				}
			}
			sb.append("\n");
		}
        		System.out.println(sb);
	}
}
        
        