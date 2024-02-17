import java.util.Scanner;

public class OddNumber {
    
    public static boolean IsOdd(int n){
        if(n % 2 == 0)
        {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        if(IsOdd(num)){
            System.out.print(2);
        }
        else {
            System.out.print(1);
        }
    }
}
