import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (N-- > 0) {
			if(check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	public static boolean check() throws IOException{
		boolean[] check = new boolean[26];
		String str = br.readLine();
		int prev = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if (prev != str.charAt(i)) {		
				if (check[str.charAt(i) - 'a'] == false) {
					check[str.charAt(i) - 'a'] = true;
					prev = str.charAt(i);				
				}else {
					return false;	
				}
			}
		}    
		return true;
	}
}    