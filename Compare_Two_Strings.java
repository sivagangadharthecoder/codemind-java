import java.util.*;

public class VowelsCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        boolean flag = false;
       
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                flag = true;
            }
        }
        
        if(a.length() != b.length()){
            System.out.println("Strings are not Equal");
        }
        else if(flag == true){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }
        
    }
}