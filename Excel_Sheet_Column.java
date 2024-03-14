import java.util.*;

public class Main {
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            n--;
            char ch = (char) ('A' + (n % 26));
            sb.append(ch);
            n /= 26;
        }
        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(convertToTitle(n));
    }
}

