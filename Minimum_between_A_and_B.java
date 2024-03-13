import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) 
            arr[i] = sc.nextInt();
        
        int a = sc.nextInt(), b = sc.nextInt();

        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= a && arr[i] <= b && arr[i] < arr[i + 1]) {
                min = Math.min(min , arr[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print(-1);
        } else {
            System.out.print(min);
        }
    }
}
