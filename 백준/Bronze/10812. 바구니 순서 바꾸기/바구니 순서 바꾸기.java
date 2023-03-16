
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st;
        st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int basket[] = new int[N + 1];
        int newBasket[] = new int[N + 1];

        for (int s = 1; s <= N; s++) {
            basket[s] = s;
            newBasket[s] = s;
        }

        int i, j, k;

        for (int s = 0; s < M; s++) {
            st = new StringTokenizer(br.readLine() , " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            int index = i;

            for (int g = 0; g < j - i + 1; g++) {
                if (k + g <= j) {
                    newBasket[g + i] = basket[k + g];
                } else {
                    newBasket[g + i] = basket[index++];
                }
            }

            for (int g = 1; g <= N; g++) {
                basket[g] = newBasket[g];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int s = 1; s <= N; s++) {
            sb.append(newBasket[s] + " ");
        }
        
        System.out.println(sb);
	}
}    