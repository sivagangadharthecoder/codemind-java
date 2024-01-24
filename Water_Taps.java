import java.util.*;
public class Watertaps 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum = ((a*b)/(a+b));
        System.out.println(sum);
    }
}