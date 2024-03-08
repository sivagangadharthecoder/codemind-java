import java.util.*;

public class Max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        boolean replaced = false;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == '6' && !replaced){
                sb.append('9');
                replaced = true;
            }
            else{
                sb.append(ch);
            }
        }
        
        System.out.print(sb);
    }
}