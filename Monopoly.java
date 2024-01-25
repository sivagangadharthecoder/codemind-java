import java.util.*;

public class monopoly{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int t = obj.nextInt();
        for(int i=0; i<t; i++){
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();
            
            if(a <= (b+c) && b <= (a + c) && c <= (a + b)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
    }
}