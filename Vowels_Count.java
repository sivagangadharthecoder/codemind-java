import java.util.*;

public class VowelsCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        str = str.toLowerCase();
        int vowelCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
        }
        System.out.print(vowelCount);
    }
}