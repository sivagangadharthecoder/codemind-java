import java.util.*;

public class SumOfDigits {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String inputString = sc.nextLine();
        
        int sum = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        
        System.out.println(sum);
    }
}
