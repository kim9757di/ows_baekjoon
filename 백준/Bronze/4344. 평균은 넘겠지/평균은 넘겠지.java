
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] student;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
			
			int student_num = Integer.parseInt(st.nextToken()); 
			student = new int[student_num];

			
			
			int tmpSum = 0;
			for (int i = 0; i < student_num; i++) {
				int tmpToken = Integer.parseInt(st.nextToken());
				tmpSum += tmpToken;
				student[i] = tmpToken; 
			}
			
			double result = tmpSum/student_num;
			double cnt = 0;
			for (int i = 0; i < student_num; i++) {
				if(student[i] > result) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/student_num)*100);
		}
    }
}