import java.util.*;

public class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i=0; i<size; i++){
            sum+=A[i];
        }
        
        int avg = sum / size;
        
        int count = 0;
        for(int i=0; i<size; i++){
            if(A[i] == avg){
                count++;
                break;
            }
        }
        if(count != 0){
            System.out.print("True");
        }
        else System.out.print("False");
    }
}
