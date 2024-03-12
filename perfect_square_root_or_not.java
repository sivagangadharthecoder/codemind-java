import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    
	    boolean flag = false;
	    for(int i=1; i<=Math.sqrt(num); i++){
	        for(int j=0; j<=Math.sqrt(num); j++){
	            if(i * j == num){
	                flag = true;
	            }
	        }
	    }
	    
	    if(flag){
	        System.out.print("True");
	    }
	    else{
	        System.out.println("False");
	    }
	}
}
