import java.util.*;

public class Factor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            
            int difference = b - a;
            if(a <= difference || a==b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            }
        }
    }
