import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int z = b - a;
            if(z >= a || a == b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
} 