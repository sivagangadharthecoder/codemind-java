import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        int first = 0 , second = 1;
        System.out.print(first + " "+second+" ");
        for(int i=2; i<num ; i++)
        {
            int total = first + second;
            first = second;
            second = total;
            System.out.print(total + " ");
        }
    
        
    }
}