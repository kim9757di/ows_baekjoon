import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException 	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int max = -1;
		double tot_score = 0.0;
		while(st.hasMoreElements()) {
			int tmp_score = Integer.parseInt(st.nextToken());
			
			if(tmp_score > max) {
				max = tmp_score;
			}
				tot_score +=  tmp_score;
		}
		System.out.println((tot_score/max*100.0)/n);
    }
}