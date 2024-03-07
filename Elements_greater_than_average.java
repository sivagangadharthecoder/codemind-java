import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        
        int avg = (sum / n);
        
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] >= avg){
                count++;
            }
        }
        System.out.print(count);
    }
}
