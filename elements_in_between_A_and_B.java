import java.util.*;

public class ElementsBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a == b || a > b) {
            System.out.println("-1");
        } 
        else {
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= min && arr[i] <= max) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("-1");
            }
        }
    }
}
