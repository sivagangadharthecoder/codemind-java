import java.util.*;

public class rp{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int x = obj.nextInt();
        int y = obj.nextInt();
        int attacks = y / x;
        System.out.println(attacks);
    }
}