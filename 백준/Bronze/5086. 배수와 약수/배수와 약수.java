import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmpStr;
		StringTokenizer st;
		while(!("0 0".equals(tmpStr = br.readLine()))) {
			st = new StringTokenizer(tmpStr ," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a/b == 0) {
				System.out.println("factor");
			}else if(a%b == 0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
		}
	}
}  