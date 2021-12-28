package Advance;
import java.util.*;
public class factor {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        HashSet<Integer>ls=new HashSet<>();
        for(int i=2;i<=Math.sqrt(n)+1;i++){
            if(n%i==0){
                ls.add(i);
                ls.add(n/i);
            }
            ls.add(1);
            ls.add(n);
        }
        System.out.print(ls);
        sc.close();
    }
    
}
