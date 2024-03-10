import java.util.Scanner;

public class Reverse{
    
    private static boolean isVowel(char ch){
        return "aAeEiIoOuU".indexOf(ch)!=-1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        char arr[] = str.toCharArray();
        
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            while(i < j && !isVowel(arr[i])){
                i++;
            }
            while(i < j && !isVowel(arr[j])){
                j--;
            }
            
            if(i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
        
        System.out.print(new String(arr));
    }
}