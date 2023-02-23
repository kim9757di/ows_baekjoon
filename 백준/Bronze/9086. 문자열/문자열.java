import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			String tmpStr = br.readLine();
			System.out.println(tmpStr.charAt(0)+""+tmpStr.charAt(tmpStr.length()-1));
		}
	}
}  