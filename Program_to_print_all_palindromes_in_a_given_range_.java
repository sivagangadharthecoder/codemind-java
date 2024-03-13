import java.util.*;

public class RangePalindromes{
    
    private static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        return reverse == n;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        for(int i=start; i<=end; i++)
        {
            if(isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
}