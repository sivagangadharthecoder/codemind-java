import java.util.*;

public class StringCopy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = new String(a);
        System.out.print(b);
    }
}