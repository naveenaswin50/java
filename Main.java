import java.util.*;
public class Main {
	
	public static void main(String[] ar) {
		// Write your code here
	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=0;
        int st=a;
        int end=0;
        int c = 0;
        while (a != 0) {
            a=a/10;
            c++;
        }
        while (a != 0) {
            b = a % 10;
            end+=Math.pow(b,c);
            a=a/10;
        }
        System.out.print(end);
        sc.close(); 
    }
}