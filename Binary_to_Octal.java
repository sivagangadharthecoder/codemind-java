import java.util.*;
import java.lang.*;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            
            String binary = sc.nextLine(); 
            
            int decimalNumber = Integer.parseInt(binary, 2);
            
            String OctalNumber = Integer.toOctalString(decimalNumber);
            
            System.out.println(OctalNumber);
        }
    }
}
