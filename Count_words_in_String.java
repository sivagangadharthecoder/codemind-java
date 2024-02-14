import java.util.*;

public class WordsCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        
        System.out.print(arr.length);
    }
}