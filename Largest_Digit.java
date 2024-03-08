import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int largest = 0;
        for(int i=0; i<str.length()-1; i++){
            int digit1 = Character.getNumericValue(str.charAt(i));
            int digit2 = Character.getNumericValue(str.charAt(i+1));
            
            if(digit1 > largest){
                largest = digit1;
            }
            else if(digit2 > largest){
                largest = digit2;
            }
        }
        System.out.print(largest);
        
    }
}
