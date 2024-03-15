import java.util.*;

public class Ntimes{
    
    private static int repeated(int a[], int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == n) count++;
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int A[] = new int[size];
        for(int i=0; i<size; i++){
            A[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        String str = "";
        boolean flag = false;
        for(int i=0; i<size; i++){
            if(k == repeated(A, A[i])){
                if(str.indexOf(String.valueOf(A[i])) == -1){
                    str+=A[i]+" ";
                    flag = true;
                }
            }
        }
       
       if(flag)  System.out.print(str);
       else  System.out.print(-1);
        
        
    }
}