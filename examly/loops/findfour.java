package examly.loops;
import java.util.*;
public class findfour {
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=0;
        int count = 0;
        while (a != 0) {
            b = a % 10;
            if (b== 4) {
                count++;
            }
            a=a/10;
        }
        System.out.print(count);
        sc.close();
    }
}
