import java.util.*;

public class Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            boolean flag = false;

            while (true) {
                int lengthBefore = str.length();

                str = str.replace("()", "");
                str = str.replace("[]", "");
                str = str.replace("{}", "");

                int lengthAfter = str.length();

                if (lengthBefore == lengthAfter) {
                    break;
                }
            }

            if (str.isEmpty()) {
                flag = true;
            }

            if (flag) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    }
}
