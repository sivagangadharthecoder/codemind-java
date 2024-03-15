import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int A[] = new int[size];
        for(int i=0; i<size; i++){
            A[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        
       int sum = 0;
        for(int i=0; i<size; i++){
            if(A[i] < a || A[i] > b){
                sum+=A[i];
            }
        }
        System.out.print(sum);
    }  
}