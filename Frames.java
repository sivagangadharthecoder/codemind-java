import java.util.*;

public class Perimeter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int l = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        
        int tc = c * 2*(l + b);
        
        System.out.println(tc);
    }
}