// syntax
import java.util.*;

public class Perimeter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int x = obj.nextInt();
        int y = obj.nextInt();
        int z = obj.nextInt();
        
        int nm = (z - y) / x;
        System.out.println(nm);
    }
}