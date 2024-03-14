import java.util.*;

public class Fancy{
    
    public static boolean isThreeTimes(String a, int n){
        for(int i=0; i<n-2; i++){
            if(a.charAt(i) == a.charAt(i+1) && a.charAt(i)== a.charAt(i+2)){
                return true;
            }
        }
       return false;
    }
    
    public static boolean isFiveTimes(String a, int n){
        int count= 0;
        for(int i=0; i<n; i++){
            count = 0;
            for(int j=0; j<n; j++){
                if(a.charAt(i) == a.charAt(j)){
                    count++;
                }
            }
        }
        if(count >=5){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean isIncDec(String a, int n){
        for(int i=0; i<n-2; i++){
            char b = a.charAt(i), c = a.charAt(i+1), d=a.charAt(i+2);
            int e = Character.getNumericValue(b), f = Character.getNumericValue(c), g=Character.getNumericValue(d);
            
            if(f == (e+1) && g==(e+2) || f==(e-1)&& g==(e-2)){
                return true;
            }
        }
        return false;
    } 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int n = str.length();
        if(n != 10){
            System.out.println(-1);
        }
        else{
            
        if(isThreeTimes(str, n) || isFiveTimes(str, n)|| isIncDec(str, n)){
            System.out.println("FANCY NUMBER");
        }
        else{
            System.out.println("NOT A FANCY NUMBER");
        }
        }
        
        
    }
}