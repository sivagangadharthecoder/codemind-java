import java.util.*;

public class Mul{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        for(int i=b; i<=c; i++)
        {
            System.out.print(a+" x " + i+" = " + a*i);
            System.out.print("
");
        }
        
    }
}