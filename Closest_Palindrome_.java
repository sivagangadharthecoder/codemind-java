import java.util.Scanner;

public class ClosestPalindrome {
    
    private static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        return reverse == n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int min = 0;
        for (int i = num - 1; i >= 0; i--) {
            if (isPalindrome(i)) {
                min = i;
                break;
            }
        }
        
        int max = 0;
        for (int i = num + 1; ; i++) {
            if (isPalindrome(i)) {
                max = i;
                break;
            }
        }
        
        int diff1 = Math.abs(max - num);
        int diff2 = Math.abs(num - min);
        
        if (diff1 == diff2) {
            System.out.println(min + " " + max);
        } else if (diff1 < diff2) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }
    }
}
