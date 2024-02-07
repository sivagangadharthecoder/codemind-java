import java.util.*;

public class Rides{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hf = sc.nextInt();
        int sf = sc.nextInt();
        int spf = sc.nextInt();
        int grade = calculateGrade(hf, sf, spf);
        System.out.println(grade);
    }

    public static int calculateGrade(int hf, int sf, int spf) {
        if (hf > 50 && sf > 60 && spf > 100) {
            return 10;
        } else if (hf > 50 && sf > 60) {
            return 9;
        } else if (sf > 60 && spf > 100) {
            return 8;
        } else if (hf > 50 && spf > 100) {
            return 7;
        } else if (hf > 50 || sf > 60 || spf > 100) {
            return 6;
        } else {
            return 5;
        }
    }
}
