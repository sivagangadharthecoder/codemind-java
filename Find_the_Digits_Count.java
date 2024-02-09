import java.util.*;

public class Digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int count = 0;
        while(num > 0)
        {
            int rem = num % 10;
            num = num / 10;
            count = count + 1;
        }
        
        System.out.print(count);
        
    }
}