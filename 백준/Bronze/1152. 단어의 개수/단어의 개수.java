import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//  공백기준 토큰으로 변경 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
	}
}    