import java.io.*;
import java.util.*;

public class Average{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        int avg = obj.nextInt();
        int a = obj.nextInt();
        
        int b = (avg * 2 ) - a;
        System.out.println(b);
        
    }
}