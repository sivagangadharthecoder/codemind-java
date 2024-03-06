import java.util.*;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int index = -1;
        int key = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        
        int sum = 0;
        for(int i=0; i<=index; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);
        
    }
}