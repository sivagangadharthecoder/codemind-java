import java.util.*;

public class Rotation{
    
    public static boolean isRotated(String a , String b){
        String clockwise = a.substring(a.length()-2)+a.substring(0, a.length()-2);
        String anticlock = a.substring(2)+a.substring(0,2);
        
        if(clockwise.equals(b) || anticlock.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        boolean result = isRotated(a,b);
        if(result){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}