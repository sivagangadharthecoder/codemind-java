import java.util.*;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("uppercase alphabet");
        } else if (Character.isLowerCase(ch)){
            System.out.println("lowercase alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }

    }
}
