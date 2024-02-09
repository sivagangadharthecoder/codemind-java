import java.util.*;

public class NextPalindrome{
    
    public static boolean IsPalin(int x){
        int temp = x, rev = 0;
        while(x > 0)
        {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return (temp == rev);
    }
    
    public static boolean IsPrime(int y){
        boolean flag = true;
        
        for(int i=2; i<y; i++)
        {
            if(y % i == 0)
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i = num+1; i>0; i++){
        if(IsPalin(i)){
            if(IsPrime(i)){
                System.out.println(i);
            break;
            }
            else{
                continue;
            }
        }
        else{
            continue;
        }
        }
    }
}