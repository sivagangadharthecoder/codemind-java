import java.util.*;

public class AbsoluteDifference{
    
    private static int digits(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        int diff = digits(X) - N;
        
        int first = X / (int)(Math.pow(10, diff));
        int last = X % (int)(Math.pow(10, N));
        
        System.out.print(Math.abs(last - first));
    }
}