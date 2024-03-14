import java.util.*;

public class Palindromes{
    
    private static boolean isPalindrome(int n){
    int reverse = 0;
    int temp = n;
    while(temp > 0){
        int rem = temp % 10;
        reverse = reverse * 10 + rem;
        temp = temp / 10;
    }
    return n==reverse;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(isPalindrome(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}