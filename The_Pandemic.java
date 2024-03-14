import java.util.Scanner;

public class Pandemic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
    
        int result = 0;
        if(num == 1) result = 0;
        else if (num == 2) result = 1;
        else result = 2;
        System.out.print(result);
    }
}
