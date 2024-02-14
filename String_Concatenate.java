import java.util.Scanner;

public class FirstUniqueCharIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        String c = a + b;
        char[] charArray = c.toCharArray(); 

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }
        System.out.println(charArray);
    }
}
