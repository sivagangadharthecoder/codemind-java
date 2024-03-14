import java.util.*;

public class SixNine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] arr = str.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '6'){
                arr[i] = '9';
                break;
            }
        }
        System.out.print(new String(arr));
    }
}