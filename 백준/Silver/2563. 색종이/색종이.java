import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[101][101];
		StringTokenizer st;
		int cnt = 0;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());

            for(int a = x; a < x+10; a++){
                for(int b=y; b < y+10; b++){
                    if(arr[a][b]==1) {
                    	continue;
                    }else {
                    	arr[a][b] = 1;
                    }
                    cnt++;
                }
            }
		}
		System.out.println(cnt);
	}
}    