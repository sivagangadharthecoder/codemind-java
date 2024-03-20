import java.util.Scanner;

public class FindX {

    private static long findX(long N, long M) {
        for ( x = 0; x < M; x++) {
            if ((x * x) % M == N) {
                return x;

        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int i = 0; i < T; i++) {
            long N = scanner.nextLong();
            long M = scanner.nextLong();

            long result = findX(N, M);
            System.out.println(result);
        }
    }
}