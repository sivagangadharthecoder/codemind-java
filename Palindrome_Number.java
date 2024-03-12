import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            boolean flag = true;
            for(int i=0; i<str.length(); i++){
                char start = str.charAt(i);
                char end = str.charAt(str.length()-1-i);
                if(start != end){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}