import java.util.*;

public class Palindrome{
    public static boolean IsPalindrome(String str){
    int i=0, j=str.length()-1;
    boolean flag = true;
    while(i < j){
        if(str.charAt(i) != str.charAt(j))
        {
            flag = false;
        }
        i++;
        j--;
    }
    if(flag){
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            String str = sc.nextLine();
           
            if(IsPalindrome(str)){
                if(str.length() % 2 ==0){
                    System.out.println("YES EVEN");
                }
                else{
                    System.out.println("YES ODD");
                }
            }
            else{
                System.out.println("NO");
            }
           
        }
    }
}