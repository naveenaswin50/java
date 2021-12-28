package examly.functiona;
import java.util.*;
class Fibonacci {
    long fiboLastDigits(long a){
        long x=0;
        long y=0;
        long z=1;
        for(int i=1;i<a;i++){
            x=y+z;
            y=z;
            z=x;
            
        }
        return x%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Fibonacci s=new Fibonacci();
        long a=sc.nextLong();
        System.out.print(s.fiboLastDigits(a));
        sc.close();
    }
}
