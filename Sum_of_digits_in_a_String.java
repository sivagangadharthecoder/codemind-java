import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int sum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                sum += num;
            }
        }
        
        System.out.print(sum);
    }
}
