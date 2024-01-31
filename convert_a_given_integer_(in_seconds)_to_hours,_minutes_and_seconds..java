import java.util.*;

public class HMS{
public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    int num = obj.nextInt();
    int h = num / 3600;
    int m = (num % 3600)/60;
    int s = (num % 3600)%60;
    
    System.out.println("H:M:S-"+h+":"+m+":"+s);
    }
}

