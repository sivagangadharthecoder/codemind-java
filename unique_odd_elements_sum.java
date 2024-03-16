import java.util.*;

public class UniqueOddSum {
    
    private static boolean hasDuplicates(int[] a, int target, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (a[i] == target) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (A[i] % 2 != 0 && !hasDuplicates(A, A[i], i)) {
                sum += A[i];
            }
        }
        System.out.print(sum);
    }
}
