import java.util.Scanner;

public class SameCount {

    private static int count(int a[] , int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == n){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        String result = "";
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == count(arr, arr[i])){
                if(result.indexOf(String.valueOf(arr[i]))==-1 ){
                result+= arr[i];
                result+=" ";
                flag = true;
            }
            }
        }
        if(!flag){
            System.out.print(-1);
        }
        else{
            System.out.print(result);
        }
        
    }
}
