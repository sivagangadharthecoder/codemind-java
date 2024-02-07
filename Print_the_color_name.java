import java.util.*;

public class ColorName{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        char color = sc.next().charAt(0);
        
        if(color ==  'V')
        {
            System.out.println("Violet");
        }
        else if(color == 'I')
        {
            System.out.println("Indigo");
        }
        else if(color == 'B')
        {
            System.out.println("Blue");
        }
        else if(color == 'G')
        {
            System.out.println("Green");
        }
        else if(color == 'Y')
        {
            System.out.println("Yellow");
        }
        else if(color == 'O')
        {
            System.out.println("Orange");
        }
        else if(color == 'R')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println(-1);
        }
    }
}