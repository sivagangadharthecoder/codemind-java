import java.util.*;

public class NeonNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int sq = num * num;
        
        int sum = 0;
        while(sq > 0){
            int rem = sq % 10;
            sum = sum + rem;
            sq = sq / 10;
        }
        
        if(sum == num){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}