package examly.conditional;
import java.util.*;
public class calander{
    public static void main(String[] args) {
        int n,d;
        int count = 0;  
        String arr[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1989;i<=n;i++)
         {
             if((i%4==0)&&(i%100!=0)||(i%400==0)){
             count+=2;}
             else{
              count++;}
         }
         d = count%7;
         if((n%4==0)&&(n%100!=0)||(n%400==0))
            System.out.println(arr[d-1]);
             else
              System.out.println(arr[d]);
              sc.close();
    }
}