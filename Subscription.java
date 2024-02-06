import java.util.*;

public class Subscription {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int time = sc.nextInt();
        
        if(time> 40)
        {
            System.out.println("YES");
        }
        else if(time <= 40)
        {
            System.out.println("NO");
        }
        
    }
}