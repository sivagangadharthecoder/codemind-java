import java.util.*;


public class Nnatural{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int sum = 0, i=1;
        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.print(sum);
    }
}