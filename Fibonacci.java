import java.util.*;
class Fibonacci {
    boolean fiboLastDigits(int n){
        if (n==0)
        {
            return true;
        }
        else
        {int x=0;
         int y=0;
         int z=1;
         for(int i=1;true;i++){
             if(x>=n){
                 break;
             }
             x=y+z;
            y=z;
            z=x;
         }
         if(x==n){
             return true;
         }
    }
    return false;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Fibonacci s=new Fibonacci();
        int a=sc.nextInt();
        if(s.fiboLastDigits(a)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sc.close();
    }
}
