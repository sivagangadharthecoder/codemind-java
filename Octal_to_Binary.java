import java.util.*;
import java.lang.*;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            
            String octalNumber = sc.nextLine(); 
            
            int decimalNumber = Integer.parseInt(octalNumber, 8);
            
            String binaryNumber = Integer.toBinaryString(decimalNumber);
            
            System.out.println(binaryNumber);
        }
    }
}
