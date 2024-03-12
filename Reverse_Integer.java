import java.util.*;

public class ReverseInteger {
    
    private static int reverse(int n) {
        int reverse = 0;
        int temp = Math.abs(n); 
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        if(n > 0){
            return reverse;
        }
        else{
            return -reverse;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        System.out.print(reverse(num));
        
    }
}
