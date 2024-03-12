import java.util.*;

public class Primes
{
    private static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    
	    if(isPrime(num)){
	        System.out.print("prime");
	    }
	    else{
	        System.out.println("not a prime");
	    }
	}
}
