import java.util.*;

public class SumBetweenIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= A && arr[i] <= B) {
                sum += arr[i];
            }
        }
        
        System.out.println(sum);
    }
}
