import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sbf = new StringBuffer(br.readLine());
		StringTokenizer st = new StringTokenizer(sbf.reverse().toString(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
}    