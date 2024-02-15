import java.util.*;

public class Time{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String s[] = str.split(":");
        int hours = Integer.parseInt(s[0]);
        int minutes = Integer.parseInt(s[1]);
        
        String period;
        if(hours >= 12)
        {
            period = "PM";
        }
        else{
            period = "AM";
        }
        
        if(hours > 12){
            hours = hours - 12;
        }
        else if(hours == 0)
        {
            hours = 12;
        }
        
        System.out.printf("%02d:%02d %s", hours, minutes, period);
    }
}