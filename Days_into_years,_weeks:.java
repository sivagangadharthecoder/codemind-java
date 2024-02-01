import java.util.Scanner;

public class OctalDecimal{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
     
        int days = obj.nextInt();
        int years = days / 365;
        int weeks = days % 365 / 7;
        
        System.out.println(years);
        System.out.println(weeks);
    }
}

