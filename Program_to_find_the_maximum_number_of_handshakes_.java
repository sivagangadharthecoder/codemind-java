import java.util.*;

public class HS{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        int ns = obj.nextInt();
        int nh = (((ns * (ns + 1)) / 2) - ns);
        
        System.out.println(nh);
    }
}