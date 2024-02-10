import java.util.*;

public class NextPrimePalindrome{
    
    public static boolean isPrime(int x){
        int count = 0;
        for(int i=2; i<x; i++)
        {
            if(x % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean isPalindrome(int y){
        int temp = y;
        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;
            sum = sum*10 + rem;
            temp = temp / 10;
        }
        
        if(sum == y){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i=num+1; i>0; i++)
        {
            if(isPalindrome(i))
            {
                if(isPrime(i)){
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}