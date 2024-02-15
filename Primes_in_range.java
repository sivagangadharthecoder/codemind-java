import java.util.*;

public class Primes{
    
    public static boolean IsPrime(int x){
        if(x <= 1){
            return false;
        }
        int count = 0;
        for(int i=2; i<x; i++)
        {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        for(int i=a; i<=b; i++){
            if(IsPrime(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}