
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if (a != b && b != c && a != c) {// 만약 모든 변수가 다른 경우
			int max;
			
			if (a > b) {// a가큼
				if (c > a) {// c가 max
					max = c;
				}else { // a가 max 
					max = a;
				}
			}else {// b가큼 
				if (c > b) {//c가 max
					max = c;
				}else {// b가 max
					max = b;
				}
			}
			System.out.println(max * 100);
		}else if (a == b && a == c) {// 3개의 변수가 모두 같은 경우
			System.out.println(10000 + a * 1000);
		}else if(a == b || a == c) {// a가 b혹은 c랑만 같은 경우
			System.out.println(1000 + a * 100);
		}else if (b == c){// b가 c랑 같은 경우
			System.out.println(1000 + b * 100);
		}
	}
}