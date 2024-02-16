import java.util.*;

public class Cars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        
        int count = 0;
        if(n1 >= n2){
            System.out.print(-1);
        }
        else{
            int temp = 0;
            while(temp <= x){
                x += n1;
                temp += n2;
                count++;
            }
            System.out.println(count);
        }
        
    }
}