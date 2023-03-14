
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double totScore = 0.0;
		double gpa = 0.0; 
		Map<String, Double> grade = new HashMap<>();
		grade.put("A+",4.5);
		grade.put("A0",4.0);
		grade.put("B+",3.5);
		grade.put("B0",3.0);
		grade.put("C+",2.5);
		grade.put("C0",2.0);
		grade.put("D+",1.5);
		grade.put("D0",1.0);
		grade.put("F",0.0);
		grade.put("P",0.0);
		
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine() , " ");
			st.nextToken();// 과목명 버림
			double tmpScore = Double.parseDouble(st.nextToken());
			String tmpGrade = st.nextToken();
			
			
			if(!tmpGrade.equals("P")) {
				gpa += tmpScore *grade.get(tmpGrade);
				totScore += tmpScore;
			}
		}
		System.out.println(String.format("%.6f" , gpa/totScore));
	}
}    