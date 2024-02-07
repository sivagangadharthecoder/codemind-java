import java.util.Arrays;
import java.util.Scanner;

public class ArraySumWithoutLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
