import java.util.*;

public class Pretty{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        double sum = 0;
        for(int i=1; i<=num; i++)
        {
            sum = sum + (double)(1.0/i);
        }
        System.out.printf("%.2f", sum);
    }
}