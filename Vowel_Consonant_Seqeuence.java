import java.util.Scanner;

public class Monk {
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer str = new StringBuffer(s);
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (isVowel(currentChar)) {
                while (i + 1 < str.length() && isVowel(str.charAt(i + 1))) {
                    str.deleteCharAt(i + 1);
                }
                str.replace(i, i + 1, "V");
            } else {
                while (i + 1 < str.length() && !isVowel(str.charAt(i + 1))) {
                    str.deleteCharAt(i + 1);
                }
                str.replace(i, i + 1, "C");
            }
        }
        System.out.println(str);
    }
}
