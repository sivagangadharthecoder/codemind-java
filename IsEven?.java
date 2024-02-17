import java.util.Scanner;

public class EvenNumber {
    
    public static int IsEven(int n){
        if(n % 2 == 0){
            return 2;
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int result = IsEven(num);
        System.out.print(result);
    }
}
