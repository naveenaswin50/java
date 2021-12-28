package examly.loops;
import java.util.*;
public class evenandodd {
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(),b=0;
        long odd= 0, even = 0;
        while (a != 0) {
            b = a % 10;
            if (b%2==0) {
                even=even+b;
            }else{
                odd=odd+b;
            }
            a=a/10;
        }
        System.out.print(odd+" "+even);
        sc.close();
    }
}

