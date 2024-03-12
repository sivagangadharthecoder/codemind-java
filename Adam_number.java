import java.util.*;

public class Main
{
    private static int reverse(int n){
        int reverse = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        return reverse;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    
	    int sq = num * num;
	    int rev = reverse(num);
	    int revsq = rev * rev;
	    
	    if(sq == reverse(revsq)){
	        System.out.println("True");
	    }
	    else{
	        System.out.println("False");
	    }
	}
}
