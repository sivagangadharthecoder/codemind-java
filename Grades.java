import java.util.*;

public class Grades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int cs = sc.nextInt();
        
        int percentage = (int)(((double)(p+c+b+m+cs) / 500) * 100);
        
        if(percentage >= 90)
        {
            System.out.println("Grade A");
        }
        else if(percentage >= 80 && percentage < 90)
        {
            System.out.println("Grade B");
        }
        else if(percentage >= 70 && percentage < 80)
        {
            System.out.println("Grade C");
        }
        else if(percentage >= 60 && percentage < 70)
        {
            System.out.println("Grade D");
        }
        else if(percentage >= 50 && percentage < 60)
        {
            System.out.println("Grade E");
        }
        else if(percentage < 40)
        {
            System.out.println("Grade F");
        }
    }
}