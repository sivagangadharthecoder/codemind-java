import java.util.*;

public class Perimeter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        double avg = (a + b) / 2.0;
        
        System.out.printf("%.4f", avg);
    }
}