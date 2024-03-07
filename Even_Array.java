import java.util.*;

public class Count {
    
    public static boolean isEven(int num){
        if(num % 2==0){
            return true;
        }
        else if(num == 0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean flag = true;
         for (int i = 0; i < n; i++) {
            if(!isEven(arr[i])){
                flag = false;
            }
        }
        
        
        if(flag){
            System.out.print("True");
        }
        else{
    
            System.out.print("False");
        }
    }
}
