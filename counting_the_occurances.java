import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
               count++;
            }
        }
        
        if(str.indexOf(ch) == -1)
        {
            System.out.print(-1);
        }
        else{
            System.out.print(count);
        }
    }
}
