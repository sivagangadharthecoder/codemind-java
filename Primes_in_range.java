import java.util.Scanner;

public class Primes {
    
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        for (int i = a + 1; i < b; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        
        if (isPrime(a) && isPrime(b)) {
            System.out.print(count + 2);
        } else if (isPrime(a) || isPrime(b)) {
            System.out.print(count + 1);
        } else {
            System.out.print(count);
        }
    }
}
