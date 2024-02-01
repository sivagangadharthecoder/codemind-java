import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octalNumber = scanner.next();

        int decimalNumber = 0;
        int power = 1;

        for (int i = octalNumber.length() - 1; i >= 0; i--) {
            int digit = octalNumber.charAt(i) - '0';
            decimalNumber += digit * power;
            power *= 8;
        }

        System.out.println(decimalNumber);
    }
}
