import java.util.*;

public class Fibonacci
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    
	    System.out.print(0 +" "+1+" ");
	    int first = 0, second = 1;
	    for(int i=3; i<=num ; i++){
	        int third = first + second;
	        first = second;
	        second = third;
	        System.out.print(second+" ");
	    }
	}
}
