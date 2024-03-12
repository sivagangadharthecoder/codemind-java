import java.util.*;

public class MegaPrime {
    
    private static boolean isNumberPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isDigitPrime(int n) {
        while (n > 0) {
            int rem = n % 10;
            if (!isNumberPrime(rem)) {
                return false;  // Return false if any digit is not prime
            }
            n = n / 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if (isNumberPrime(num) && isDigitPrime(num)) {
            System.out.print("Mega Prime");
        } else {
            System.out.print("Not Mega Prime");
        }
    }
}
