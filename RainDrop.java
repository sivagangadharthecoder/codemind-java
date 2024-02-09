import java.util.Scanner;

public class RaindropSounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        String result = "";
        
        if (number % 3 == 0) {
            result += "Pling";
        }
        
        if (number % 5 == 0) {
            result += "Plang";
        }
        
        if (number % 7 == 0) {
            result += "Plong";
        }
        
        if (result.isEmpty()) {
            result = Integer.toString(number);
        }
        
        System.out.println(result);
        
    }
}
