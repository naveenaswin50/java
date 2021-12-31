package examly.RecursionA;
import java.util.*;
public class MagicShow {
    String asd="int isReachable(int,int,int,int)";
    static boolean isReachable(int x1, int y1, int x2, int y2) {

        if (x1 > x2 || y1 > y2)
            return false;
        if (x1 == x2 && y1 == y2)
            return true;

        return (isReachable(x1 + y1, y1, x2, y2) || isReachable(x1, y1 + x1, x2, y2));
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (isReachable(x1, y1, x2, y2))
            System.out.print("True");
        else
            System.out.print("False");
        sc.close();
    }
}
