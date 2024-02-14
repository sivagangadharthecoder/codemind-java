import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int j=0; j<t; j++){
            String str = sc.nextLine();
            
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) {
                    flag = true;
                    break;
                }
            }
            
           if(flag){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }
        }
    }
}
