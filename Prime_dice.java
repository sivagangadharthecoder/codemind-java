import java.util.*;

public class Factor{
    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int sum = a + b;
            if(isPrime(sum)){
                System.out.println("tevitt");
            }
            else{
                System.out.println("Satya");
            }
           
        }
    }
}