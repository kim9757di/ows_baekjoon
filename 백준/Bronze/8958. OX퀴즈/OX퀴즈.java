import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			int result = 0;
			String[] strArr  = br.readLine().split("");
			int addVal = 1;
			for (int i = 0; i < strArr.length; i++) {
				if("O".equals(strArr[i])) {
					if((i != 0) && ("O".equals(strArr[i-1]))) {
						addVal++;
					}
					result +=  addVal;
				}else {
					addVal = 1;
				}
			}
			System.out.println(result);
		}
    }
}