import java.util.*;

public class Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        
        int count = 0;
        for(int i=0; i<size; i++){
            if(A[i] == n){
                count++;
                break;
            }
        }
        if(count!=0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
