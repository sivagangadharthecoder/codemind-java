import java.util.*;

public class Unique {
    
    private static boolean isRepeated(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (isRepeated(s, s.charAt(i))) {
                flag = true;
                break;
            }
        }
        
        if (!flag) {
            System.out.println("Unique Number");
        } else {
            System.out.println("Not Unique Number");
        }
    }
}
