import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            int num = sc.nextInt(); 
            
            if(num > 0){
                System.out.println("Positive Number");
            }
            else{
                System.out.println("Negative Number");
            }
    }
}
