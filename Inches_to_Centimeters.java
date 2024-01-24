import java.util.*;

public class Perimeter{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int inch = obj.nextInt();
        double cm = inch * 2.54;
        
        System.out.format("%.2f", cm);
    }
}