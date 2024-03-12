import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    
	    int temp = num;
	    
	    while(temp > 9){
	    int sum = 0;
	    while(temp>0){
	        int rem = temp % 10;
	        sum += Math.pow(rem, 2);
	        temp = temp / 10;
	    }
	        temp = sum;
	    }
	    
	    
	    if(temp == 1 || temp == 7){
	        System.out.println("True");
	    }
	    else{
	        System.out.println("False");
	    }
	}
}
