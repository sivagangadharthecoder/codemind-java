import java.util.*;

public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(str);
        
        int i = sb.length() -1;
        while(i >= 0)
        {
            System.out.print(sb.charAt(i));
            i--;
        }
    }
}