import java.util.*;

public class Swap{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a);
        System.out.println(b);
    }
}