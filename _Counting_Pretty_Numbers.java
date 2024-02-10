import java.util.*;

public class Pretty{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int k=0; k<t; k++){
            
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        for(int i=a; i<=b; i++)
        {
            
            int num = i;
            
            int rem = num % 10;
            if(rem==2 || rem==3 || rem==9)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
    }
}