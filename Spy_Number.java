import java.util.*;

public class SpyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int sum = 0, product = 1;
        
        int x = num;
        while(x > 0){
            int rem = x % 10;
            sum = sum + rem;
            product = product * rem;
            x = x / 10;
        }
        if(sum == product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}