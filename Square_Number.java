import java.util.*;

public class SquareNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        boolean flag = false;
        for(int i=0; i<=Math.sqrt(num); i++)
        {
            for(int j=0; j<=Math.sqrt(num); j++){
                if(i*i + j*j == num){
                    flag = true;
                }
            }
        }
        System.out.print(flag ? "True" : "False");
    }
}