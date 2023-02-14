import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(hansu(Integer.parseInt(br.readLine())));
    }
	public static int hansu(int num) {
		int cnt = 99; 
 
		if (num < 100) {
			return num;
		} else {
			for (int i = 100; i <= num; i++) {
				int hun = i/100; 
				int ten = (i/10)%10; 
				int one = i%10;
				//등차수열의 공식 이용 
				if ((hun - ten) == (ten - one)) { 
					cnt++;
				}
			}
			return cnt;
		}
	}
}    