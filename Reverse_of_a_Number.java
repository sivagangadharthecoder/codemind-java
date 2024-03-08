import java.util.Scanner;

public class Super {
    
    public static int Reverse(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        return sum;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        System.out.println(Reverse(num));
    }
}
