import java.util.*;

public class Factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int i = 1;
        while(i <= num){
            
            if(num % i == 0){
                System.out.print(i+ " ");
            }
            
            i++;
        }
    }
}