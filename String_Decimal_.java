import java.util.*;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
           
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (Character.isDigit(ch)) {
                    count++;
                }
            }
            if (count == str.length()) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
