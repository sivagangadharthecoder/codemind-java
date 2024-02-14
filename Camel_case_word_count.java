import java.util.Scanner;

public class CamelCaseWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int count = 1;
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
        
        System.out.print(count);
        
    }
}
