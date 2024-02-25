import java.util.*;

public class Solution
{
    public static int climbStairs(int n)
    {
        if(n <= 2)
            return n;

        int a = 1;
        int b = 2;

		for(int i = 3; i <= n; i++)
		{
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        System.out.print(climbStairs(num));
    } 
}