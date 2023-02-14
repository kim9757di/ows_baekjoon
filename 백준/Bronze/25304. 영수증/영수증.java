import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException 	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int totAmt = Integer.parseInt(br.readLine());
		int totCnt = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < totCnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine() , " ");	
			result += Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken()); 
		}
		
		if(result == totAmt) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}