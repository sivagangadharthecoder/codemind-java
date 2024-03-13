import java.util.Scanner;

public class SameCount {

    private static int count(int a[], int n) {
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
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int elementCount = count(arr, element);
            if (element == elementCount && sb.indexOf(String.valueOf(arr[i])) == -1) {
               sb.append(arr[i]);
                flag = true;
            }
        }

        
        
            System.out.print(sb.toString().length());
        
    }
}
