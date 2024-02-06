import java.util.*;

public class DragonFruit{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        
        int kg = sc.nextInt();
        
        if(kg > 2 && kg % 2 == 0)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}