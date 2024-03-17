import java.util.*;

public class StringGreat{
    
    private static String greatString(String s){
        StringBuffer sb = new StringBuffer(s);
        
        for(int i=0; i<=sb.length()-2; i++){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i+1);
            if(ch1!=ch2 && Character.toLowerCase(ch1) == Character.toLowerCase(ch2)){
                sb.delete(i , i+2);
                i = 0;
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        
        System.out.println(greatString(str));
    }
}