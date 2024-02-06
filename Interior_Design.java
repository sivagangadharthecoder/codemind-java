import java.util.*;

public class InteriorDesign{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        if(x1 + y1 < x2 + y2)
        {
            System.out.println(x1+y1);
        }
        else{
            System.out.println(x2+y2);
        }
    }
}