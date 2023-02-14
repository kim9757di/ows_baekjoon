import java.util.*;

public class Main{    
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
		    int hour =sc.nextInt();
		    int min =sc.nextInt();
		    int makeMin =sc.nextInt();
	 	    int fMin = (hour*60)+min+makeMin;
		
		    if(fMin > 60) {
			    hour = fMin/60;
			    min = fMin%60; 
		    }
		
		
		    if(hour > 23) {
			    hour = hour - 24;
		    }
            System.out.println(hour +" "+ min);
        }

}
    