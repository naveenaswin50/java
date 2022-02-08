import java.util.*;

public class Q1 {
    char from;
    char to;
    String s;
    int dec;

    Q1(char a, char b, String c) {
        this.from = a;
        this.to = b;
        this.s = c;
    }

    void convert() {
        if (from == 'D') {
            this.dec = Integer.parseInt(s);
        } else if (from == 'O') {
            this.dec = Integer.parseInt(s, 8);
        } else if (from == 'H') {
            this.dec = Integer.parseInt(s, 16);
        } else if (from == 'B') {
            this.dec = Integer.parseInt(s, 2);
        }
        if (to == 'B') {
            System.out.println(Integer.toBinaryString(this.dec));
        } else if (to == 'H') {
            System.out.println(Integer.toHexString(this.dec));
        } else if (to == 'O') {
            System.out.println(Integer.toOctalString(this.dec));
        } else if (to == 'D') {
            System.out.println(this.dec);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char from = sc.next().charAt(0);
        char to = sc.next().charAt(0);
        String s = sc.next();
        Q1 q = new Q1(from, to, s);
        q.convert();

    }
}
