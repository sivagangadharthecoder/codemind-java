import java.util.*;

public class SuperNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int sq = num * num;
        
        int temp = num;
        int count = 0;
        while(temp != 0){
            int rem = temp % 10;
            count++;
            temp = temp / 10;
        }
        
        int length = count;
        
        int result = sq % (int)Math.pow(10,count);
        
        if(result==num) System.out.println("Automorphic Number");
        else System.out.println("Not an Automorphic Number");
    }
}
