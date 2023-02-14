import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split("");
		int result = 0;
		for (int i = 0; i < N; i++) {
			result += Integer.parseInt(arr[i]);
		}
		System.out.println(result);
	}
}