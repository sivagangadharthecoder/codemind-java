// syntax
import java.util.*;

public class Perimeter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int r = obj.nextInt();
        double area = 3.14 * r * r;
        
        System.out.printf("%.2f", area);
    }
}