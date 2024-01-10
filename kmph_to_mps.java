import java.io.*;
import java.util.*;

public class khms{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        int s= obj.nextInt();
        
        double result = (s * 5 )/ 18.0;
    
        System.out.format("%.2f", result);
        
    }
}