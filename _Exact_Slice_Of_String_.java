import java.util.*;

public class Slicing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=a; i<=b; i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}