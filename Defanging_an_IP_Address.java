import java.util.*;

public class Ip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuffer str = new StringBuffer(s);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.') {
                str.replace(i, i + 1, "[.]");
                i += 2;
            }
        }
        System.out.print(str);
    }
}
