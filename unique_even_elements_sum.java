import java.util.*;

public class UniqueEvenSum {
    
    private static boolean has(int[] a, int currentIndex, int n){
        for(int i = 0; i < currentIndex; i++){
            if(a[i] == n){
                return true;
            }
        }
        return false;
    }
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < size; i++){
            if(A[i] % 2 == 0 && !has(A, i, A[i])){
                sum += A[i];
            }
        }
        System.out.println(sum);
    }
}
