import java.util.*;

public class Solution {
    public static String greatString(String s) {
        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < sb.length() - 1; i++) {
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i + 1);
            if (Character.toLowerCase(ch1) == Character.toLowerCase(ch2) && ch1 != ch2) {
                sb.delete(i, i + 2);
                return greatString(sb.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        sc.nextLine();
        String str = sc.next();
        
        System.out.println(greatString(str));
        
    }
}