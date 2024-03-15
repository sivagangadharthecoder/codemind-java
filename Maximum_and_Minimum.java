import java.util.Scanner;
import java.util.Arrays;

public class Sum{
    
    private static int frequency(int a[], int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == n){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int A[] = new int[size];
        for(int i=0; i<size; i++){
            A[i] = sc.nextInt();
        }
        
       
        int count = 0;
        for(int i=0; i<size; i++){
            if(A[i] == frequency(A, A[i])){
                count++;
            }
        }
        
        if(count != 0){
            int B[] = new int[count];
        int index = 0;
        for(int i=0; i<size; i++){
            if(A[i] == frequency(A, A[i])){
                B[index] = A[i];
                index++;
            }
        }
        Arrays.sort(B);
        System.out.print(B[0]+" "+B[count-1]);
        }
        
        else{
            System.out.print(-1);
        }
    }  
}