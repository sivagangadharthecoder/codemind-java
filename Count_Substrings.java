import java.util.Scanner;

public class SubStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int length = sc.nextInt();
            sc.nextLine();   
            String str = sc.nextLine();
            
            int count1 = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '1'){
                    count1++;
                }
            }
            
            int count2 = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '1'){
                    for(int j=i+1; j<str.length(); j++){
                        if(str.charAt(j) == '1'){
                            count2++;
                        }
                    }
                }
            }
            
            System.out.println(count1 + count2);
            
        }
    }
}