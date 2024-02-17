import java.util.*;

public class Candies{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int extra = sc.nextInt();
        
        int max = 0;
        for(int j=0; j<size; j++)
        {
            if(arr[j] >= max){
                max = arr[j];
            }
        }
        
        for(int k=0; k<size; k++){
            if(arr[k]+extra >= max)
            {
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}