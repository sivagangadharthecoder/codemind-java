import java.util.*;

public class Pretty{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            int count = 0;
            for(int i=start; i<=end; i++){
                if(i%10==2 || i%10==3|| i%10==9){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}