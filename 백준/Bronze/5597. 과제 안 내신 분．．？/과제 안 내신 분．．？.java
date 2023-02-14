import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[30];
		for (int i = 0; i < (arr.length-2); i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n-1]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				System.out.println(i+1);
			}
		}
    }
}