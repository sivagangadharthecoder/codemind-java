import java.util.*;

public class Monk{
    
    public static boolean IsVowel(char ch){
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int maxCount=0 , count = 0;
        for(int i=0; i<str.length(); i++){
            if(IsVowel(str.charAt(i)))
            {
                count = 1;
                while(i + 1 < str.length()&&IsVowel(str.charAt(i+1)))
                {
                    count++;
                    i++;
                }
            }
            if(count>maxCount){
                maxCount = count;
            }
        }
        System.out.print(maxCount);
        
    }
}