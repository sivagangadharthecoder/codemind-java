import java.util.*;

public class CircularPrime {
    
    private static boolean isPrime(int n){
        if (n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;
        while(temp != 0){
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        
        if(isPrime(num) && isPrime(reverse)){
            System.out.print("circular prime");
        }
        else if(isPrime(num) && !isPrime(reverse)){
            System.out.print("prime but not a circular prime");
        }
        else {
            System.out.print("not prime");
        }
    }
}
