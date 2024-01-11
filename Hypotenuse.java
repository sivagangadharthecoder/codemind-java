import java.util.*;

public class Hypotenus{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        double h = Math.sqrt(a*a + b*b);
        
        System.out.format("%.2f" , h);
    }
}