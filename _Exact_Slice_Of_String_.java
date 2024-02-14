import java.util.*;

public class Slicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String slicedStr = str.substring(a, b + 1);
        System.out.println(slicedStr);
        }
    }
}
