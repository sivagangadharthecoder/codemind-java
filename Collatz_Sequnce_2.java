import java.util.*;

public class Series{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int maxNumber = 0;
        int maxCount = 0;
        
        for(int i=a; i<=b; i++)
        {
            int count = 0;
            int num = i;
            while(num != 1){
                if(num % 2 == 0){
                    num = num / 2;
                }
                else{
                    num = 3*num + 1;
                }
                count++;
            }
            
            if(count > maxCount){
                maxCount = count;
                maxNumber = i;
            }
        }
        
        System.out.print(maxNumber);
    }
}