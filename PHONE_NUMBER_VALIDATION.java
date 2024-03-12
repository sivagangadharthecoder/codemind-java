import java.util.*;

public class Valid
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String str = sc.nextLine();
	    
	    if(str.charAt(0)!=0 && str.length() == 10){
	        System.out.println("Valid");
	    }
	    else{
	        System.out.println("Invalid");
	    }
	}
}
