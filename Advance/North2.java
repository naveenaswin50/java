package Advance;
import java.util.*;
public class North2 {
    private static Scanner sc;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0,zc=0;
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if(t==1)
                res += zc;    
            else
                 zc++;
        }
        System.out.println(res);
    } 
}
