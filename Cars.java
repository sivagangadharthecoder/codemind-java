import java.util.Scanner;

public class CarRacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        
        int count = 0;
        
        if(n1 >= n2) {
            System.out.println(-1);
        } 
        else {
            for (int temp = 0; temp <= x; temp += n2) {
                x += n1;
                count++;
            }
            System.out.println(count);
        }

    }
}
