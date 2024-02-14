import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
                flag = true;
            }
        }
        
        if(flag)
        System.out.print("Contains "+count+" digit");
        else
        System.out.print("Doesn't contain digit");
    }
    
}
