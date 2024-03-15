import java.util.*;

public class Minimum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        System.out.print(A[0]);
    }
}
