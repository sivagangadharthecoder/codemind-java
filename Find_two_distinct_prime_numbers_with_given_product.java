import java.util.*;

public class PrimeProduct {
    
    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int one = 0, two = 0;
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                for (int j = i + 1; j < num; j++) {
                    if (isPrime(j)) {
                        if (i * j == num) {
                            one = i;
                            two = j;
                        }
                    }
                }
            }
        }
        
        if (one != 0 && two != 0) {
            System.out.println(one + " " + two);
        } else {
            System.out.println("-1");
        }
    }
}
