import java.util.*;

public class LastTwo{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        int n = obj.nextInt();
        
        int sum = n % 100;
        
        if(sum < 10){
        System.out.println("0"+sum);
        }
        else{
            System.out.println(sum);
        }
    }
}