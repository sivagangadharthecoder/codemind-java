import java.util.*;

public class Fever{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int temperature = sc.nextInt();
        
        if(temperature > 98)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}