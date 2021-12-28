package examly.Recursion;
import java.util.Scanner;
public class Art {
    
    String ab="void printNumbers(int)";
	static int i=1;
	public static void printNumbers(int n) {
		if(i<=n) {
			System.out.print(i+" ");
			i++;
			printNumbers(n);
		}
	}
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printNumbers(n);
        sc.close();
	}
}