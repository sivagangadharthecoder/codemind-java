import java.util.*;

public class rp{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int t = obj.nextInt();
        for(int itr=0; itr< t; itr++){
            int a = obj.nextInt();
            int b = obj.nextInt();
            
            int q = a / b;
            int r = a % b;
            System.out.println(q+r);
            
        }
    }
}