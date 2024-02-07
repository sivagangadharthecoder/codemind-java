import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double u, c = 0;
        
        String id = scanner.nextLine();
        String name = scanner.nextLine();
        u = scanner.nextDouble();

        if (u <= 199) {
            c = u * 1.20;
        } else if (u >= 200 && u < 400) {
            c = u * 1.50;
        } else if (u >= 400 && u < 600) {
            c = u * 1.80;
        } else {
            c = u * 2.00;
        }

        if (u > 400) {
            c = c + c * 0.15;
        } else {
            c = c + 100;
        }

        System.out.printf("%.2f", c);
        scanner.close();
    }
}
