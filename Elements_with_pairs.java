import java.util.*;

public class Pairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        if(size %2 == 0){
            for(int i=0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print(0);
        }
    }
}