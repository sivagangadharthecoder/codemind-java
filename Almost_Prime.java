import java.util.*;

public class AlmostPrime {
    public static boolean IsPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int num = sc.nextInt();
            boolean flag = false;
            for (int i = 2; i <= num; i++) {
                if (IsPrime(i)) {
                    for (int j = i + 1; j <= num; j++) {
                        if (IsPrime(j) && i * j == num) {
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
