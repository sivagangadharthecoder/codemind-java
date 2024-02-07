import java.util.*;

public class Tickets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int price = sc.nextInt();
       
        if(4 * price <= 1000 ) {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
    }
}