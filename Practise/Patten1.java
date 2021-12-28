package Practise;
import java.util.*;
public class Patten1 {
    public static void main(String[]yy){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(n%2==0){
                    if((i+j)%2!=0&&i+j>=n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if((i+j)%2==0&&i+j>=n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            for(int j=1;j<n;j++){
                if((i+j)%2==0&&(i>=j)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
