import java.util.Scanner;

public class OctalDecimal{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        char ch = obj.next().charAt(0);
        int ascii = (int)ch;
        
        System.out.println(ascii);
    }
}


