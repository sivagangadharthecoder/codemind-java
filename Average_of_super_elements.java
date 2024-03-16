import java.util.*;

public class AverageSuper {
    
    private static int frequency(int a[], int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == n){
                count++;
            }
        }
        return count;
    }
    
    private static boolean Has(int A[], int currentIndex, int n){
        for(int i=0; i<currentIndex; i++){
            if(A[i] == n){
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
        
        int count = 0;
        int sum = 0;
        for(int i=0; i<size; i++){
            if(A[i] == frequency(A, A[i]) && !Has(A,i,A[i])){
                sum+=A[i];
                count++;
            }
        }
        
        if(count > 0){
            System.out.format("%.2f", (double)sum/count);
        }
        else{
            System.out.println(-1);
        }
    }
}
