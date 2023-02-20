
import java.io.*;
import java.util.*;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int cross_cnt = 1;
		int prev_cnt_sum = 0;
 
		while (true) {
			if (X <= prev_cnt_sum + cross_cnt) {	
				if(cross_cnt % 2 == 1) {	
					System.out.print((cross_cnt - (X - prev_cnt_sum - 1)) + "/" + (X - prev_cnt_sum));
					break;
				}else {	
					System.out.print((X - prev_cnt_sum) + "/" + (cross_cnt - (X - prev_cnt_sum - 1)));
					break;
				}
			} else {
				prev_cnt_sum += cross_cnt;
				cross_cnt++;
			}
		}
	}
}