import java.util.*;

public class ElementCount {
   
    private static int frequency(int a[], int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        return count;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
       
        for (int i = 0; i < arr.length; i++) {
            boolean printed = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    printed = true;
                    break;
                }
            }
            if (!printed) {
                System.out.print(arr[i] + " " + frequency(arr, arr[i]) + " ");
            }
        }
    }
}
