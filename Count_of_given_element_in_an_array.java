import java.util.*;

public class Count {
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
            }
        }
        System.out.print(count);
    }
}
