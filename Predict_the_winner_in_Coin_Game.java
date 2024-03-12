import java.util.*;

public class CoinGame{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        String result = "";
        if(m%2==0 && n%2==0){
            result = "Player 1";
        }
        else if(m%2!=0 && n%2!=0){
            result = "Player 2";
        }
        else if(m%2==0 && n%2!=0){
            result = "Player 1";
        }
        else if(m%2!=0 && n%2==0){
            result = "Player 1";
        }
        
        System.out.print(result);
    }
}