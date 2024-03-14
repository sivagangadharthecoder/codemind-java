import java.util.Scanner;
import java.util.Arrays;

public class OptimalString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            
            boolean flag = true;
            for(int i=0; i<size-1; i++){
                if(arr[i] > arr[i+1]){
                    flag = false;
                }
            }
            if(flag){
                System.out.println(0);
            }
            else{
                Arrays.sort(arr);
                System.out.println(arr[size-1]-arr[0]);
            }
            
            
        }
    }
}