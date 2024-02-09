import java.util.*;

public class DigitsSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        String str = Integer.toString(num);
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(str.length()-1);
        
        int first = Character.getNumericValue(firstChar);
        int second = Character.getNumericValue(secondChar);
        
        System.out.print(first + second);
    }
}