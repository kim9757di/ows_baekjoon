
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		for(int ch : br.readLine().toCharArray()) {
			if(ch > 96) {
				arr[ch-97]++;
			}else {
				arr[ch-65]++;
			}
		}
		int max = 0;
		char result= '0';
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i+65);
			}else if(arr[i] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
		
	}
}    