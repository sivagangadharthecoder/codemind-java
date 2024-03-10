import java.util.*;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        
        char one = num.charAt(0);
        char two = num.charAt(num.length()-1);
        
        int first = Character.getNumericValue(one);
        int second = Character.getNumericValue(two);
        
        System.out.print(first + second);
    }
}