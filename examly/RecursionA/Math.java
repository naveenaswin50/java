package examly.RecursionA;
import java.util.*;
public class Math {
    String as="int summation(int,int)";
    static long summation(long n) {
        return (n * (n + 1) / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        sc.close();
        while (m != 0) {
            n = summation(n);
            --m;
        }
        System.out.println(n);
    }
}