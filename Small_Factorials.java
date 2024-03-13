import java.util.*;

public class Factorials{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            
            int fact = 1;
            if(num == 0 || num == 1){
                fact = 1;
            }
            else if(num == 2){
                fact = 2;
            }
            else if(num > 2){
                int j = num;
                while(j > 0){
                    fact = fact*j;
                    j--;
                }
            }
            System.out.println(fact);
        }
    }
}