import java.util.*;

public class Season{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num==4 || num==5 || num==6)
        {
            System.out.println("Summer");
        }
        else if(num==7 || num==8 || num==9 || num==10)
        {
            System.out.println("Rainy");   
        }
        else if(num==11 || num==12 || num==1)
        {
            System.out.println("Winter");   
        }
        else if(num==2 || num==3)
        {
            System.out.println("Spring");
        }
        else{
            System.out.println(-1);
        }
    }
}