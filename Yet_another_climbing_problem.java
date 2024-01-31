import java.util.*;

public class Climb{
public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    
    int t = obj.nextInt();
    for(int i = 0; i < t; i++){
    int a = obj.nextInt();
    int b = obj.nextInt();
    
    int q = a / b;
    int r = a % b;
    System.out.println(q + r);
    
    }
}
}