import java.util.*;

public class Sequence {
    
    private static int toOne(int n){
        int count = 0;
       while(n > 1){
           if(n % 2 == 0){
               n = n / 2;
           }
           else{
               n = 3 * n + 1;
           }
           count++;
       }
       return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int maxcount = 0, maxnumber = 0;
        for(int i=a; i<=b; i++){
            if(toOne(i) > maxcount){
                maxcount = toOne(i);
                maxnumber = i;
            }
        }
        System.out.println(maxnumber);
    }
}