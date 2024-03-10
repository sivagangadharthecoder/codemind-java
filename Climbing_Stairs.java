import java.util.*;

public class Climbing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n <= 2){
            System.out.println(n);
        }
        else{
            int a = 1;
            int b = 2;
            int sum = 0;
            for(int i=3; i<=n; i++){
                sum = a+b;
                a = b;
                b = sum;
            }
            System.out.print(sum);
        }
    }
}