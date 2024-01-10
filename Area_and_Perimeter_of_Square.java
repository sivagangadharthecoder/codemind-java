import java.io.*;
import java.util.*;

public class area_peri{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        
        int s = obj.nextInt();
        
        int peri = 4 * s;
        int area = s * s;
        
        System.out.println(area+" "+peri);
    }
}