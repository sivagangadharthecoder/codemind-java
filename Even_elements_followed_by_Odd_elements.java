import java.util.*;

public class EvenOdd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        
        int B[] = new int[size];
        
        int index = 0;
        for(int i=0; i<size; i++){
            if(A[i]%2==0){
                B[index] = A[i];
                index++;
            }
        }
         for(int i=0; i<size; i++){
            if(A[i]%2!=0){
                B[index] = A[i];
                index++;
            }
        }
        
         for(int i=0; i<size; i++){
            System.out.print(B[i]+" ");
        }
    }
}
