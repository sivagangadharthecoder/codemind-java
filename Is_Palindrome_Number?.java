import java.util.*;

public class Palindrome{
    
    public static int isPalin(int num){
        
        if(num < 10){
            return 2;
        }
        
        int temp = num; 
        int reverse = 0;
        while(temp > 0){
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        
        if(reverse == num){
            return 2;
        }
        else{
            return 1;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        System.out.println(isPalin(num));
    }
}