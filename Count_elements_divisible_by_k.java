import java.util.Scanner;

public class Divisible {
    
    public static int IsDivisible(int[] a, int l, int n){
        int count = 0;
        for(int i=0; i<l; i++)
        {
            if(a[i] % n == 0)
            {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int num = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int result = IsDivisible(arr, size, num);
        System.out.println(result);
    }
}
