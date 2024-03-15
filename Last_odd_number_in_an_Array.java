import java.util.*;

public class Minimum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        
        int result = 0;
        for (int i = 0; i < size; i++) {
            if(A[i] %2 != 0){
                result = A[i];
            }
        }
        System.out.print(result);
    }
}
