
import java.io.*;
import java.util.*;
public class Main {
	 
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];	
		StringBuilder sb = new StringBuilder();
		int n;
		for (int i = 1; i < check.length; i++){
			n = check_ctor(i);
		
			if(n < check.length){	
				check[n] = true;
			}
		}
        
		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {	
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
 
	public static int check_ctor(int number){
		int sum = number;
		while(number != 0){
			sum = sum + (number % 10); 
			number = number/10;	
		}
		return sum;
	}
}    