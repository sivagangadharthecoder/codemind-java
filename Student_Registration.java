import java.util.*;

public class Registration {
        public static void main(String[] args){
            Scanner sc =  new Scanner(System.in);
            
            int t = sc.nextInt();
            for(int i=0; i<t; i++)
            {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                
                if(m - k >= n)
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }

