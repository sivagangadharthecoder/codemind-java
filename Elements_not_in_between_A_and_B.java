import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (A[i] < a || A[i] > b) {
                count++;
            }
        }
        
        if (count > 0) {
            int[] notInRange = new int[count];
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (A[i] < a || A[i] > b) {
                    notInRange[index] = A[i];
                    index++;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.print(notInRange[i] + " ");
            }
        } else {
            System.out.print(-1);
        }
    }
}
