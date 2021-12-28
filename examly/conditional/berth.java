package examly.conditional;
import java.util.*;
class Solution{
    public static void main(String[] args) {
        int x;
        Scanner sc =new Scanner (System.in);
        String []arr = {"LB","MB","UB"};
        int n=sc.nextInt();
        x = n%8;
        if (x==0)
             System.out.println((n-1) + "SL");
        else if(x%7==0)
             System.out.println((n+1) + "SU");
        else if(x<=3)
             System.out.println((n+3) + arr[x-1]);
        else if(x>3 && x<7)
             System.out.println((n-3) + arr[(x-1)-3]);
             sc.close();
    }
}