import java.util.*;

public class Perimeter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int c = obj.nextInt();
        
        double f = c * (9.0 / 5.0) + 32;
        
        System.out.format("%.2f", f);
    }
}