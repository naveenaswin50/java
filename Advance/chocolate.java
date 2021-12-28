package Advance;
import java.util.*;
class chocolate{
    private static Scanner sc;
    public static void main(String[] ar){
        sc = new Scanner(System.in);
        int n=sc.nextInt();
        int zc=0;
        for(int i=0;i<n;i++)
        {
            int t = sc.nextInt();
            if(t==0){
                zc++;
            }
            else{
                System.out.print(t+" ");                
            }
        }
        for(int i=0;i<zc;i++)
            System.out.print("0 ");
    }   
}