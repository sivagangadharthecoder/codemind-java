import java.util.*;

public class Pretty{
    
    public static boolean IsRemainder(int x){
        int rem = x % 10;
        if(rem == 2 || rem== 3 || rem==9){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int count = 0;
            for(int j=a; j<=b; j++)
            {
                if(IsRemainder(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}