import java.util.Scanner;

public class Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < t; j++) {
            String str = sc.nextLine();
            int n = str.length();
            while (n > 0 && str.contains("()") || str.contains("[]") || str.contains("{}")) {
                str = str.replace("()", "").replace("[]", "").replace("{}", "");
                n = str.length();
            }
            boolean flag = str.isEmpty(); 
            if(flag){
            System.out.println("True");
            }
            else{
            System.out.println("False");
            }
        }
    }
}
