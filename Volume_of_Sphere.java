import java.io.*;
import java.util.*;
//import java.lang.Math.*;

public class Sphere{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
       int r = obj.nextInt();
       
       double volume = (4.0 / 3.0) * 3.14 * r * r * r;
       
       System.out.format("%.2f", volume);
    }
}