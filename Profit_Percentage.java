import java.util.*;

public class Lp{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        int Y = obj.nextInt();
        
        double profit = Y - X;
        double pf = (profit / X) * 100;
        
        System.out.format("%.2f", pf);
    }
}