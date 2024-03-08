import java.util.*;

public class Max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        
        int maxnum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] >=min && arr[i] <=max){
                if(arr[i] > maxnum){
                    maxnum = arr[i];
                }
            }
        }
        
        if(maxnum == 0){
            System.out.println("-1");
        }
        else{
            System.out.println(maxnum);
        }
    }
}