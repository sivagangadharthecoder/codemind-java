import java.util.*;

public class RainFall{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int rain = sc.nextInt();
        
        if(rain < 3)
        {
            System.out.println("LIGHT");
        }
        else if(rain >=3 && rain < 7)
        {
            System.out.println("MODERATE");
        }
        else if(rain >=7)
        {
            System.out.println("HEAVY");
        }
    }
}