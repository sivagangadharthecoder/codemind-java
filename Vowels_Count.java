import java.util.*;

public class CountVowels{
    
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int count = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(isVowel(str.charAt(i)))
            {
                count++;
            }
        }
        
        System.out.print(count);
        
    }
}