import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String tmpStr = "";
		for (int i = (str.length()-1); i >= 0; i--) {
			tmpStr += str.charAt(i);
		}
		if(str.equals(tmpStr)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}    