import java.util.*;

public class Choice{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            
            double one = (double)y1 / x1;
            double two = (double)y2 / x2;

            
            
            if(one < two)
            {
                System.out.println(-1);
            }
            else if(one > two)
            {
                System.out.println(1);
            }
            else if(one == two || (x1==y1 && x2==y2) )
            {
                System.out.println(0);
            }
        }
    }
}