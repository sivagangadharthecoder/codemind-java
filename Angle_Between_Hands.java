import java.util.Scanner;

public class ClockAngle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String time = scanner.next();

        // Split the time string into hours and minutes
    String[] timeParts = time.split(":");
    int hour = Integer.parseInt(timeParts[0]);
    int minute = Integer.parseInt(timeParts[1]);

    int minuteAngle = minute * 6;
    double hourAngle= hour * 30 + minute/2.0;
    
    double angle = Math.abs(hourAngle - minuteAngle);
    double minAngle = Math.min(angle , 360-angle);
    
    System.out.print(minAngle);
    }
}
