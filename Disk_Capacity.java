import java.util.*;

public class Perimeter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int t = obj.nextInt();
        int s = obj.nextInt();
        int b = obj.nextInt();
        
        int capacity = 2 * t * s * b * 512;
        System.out.print(capacity);
    }
}