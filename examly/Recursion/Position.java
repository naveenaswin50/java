package examly.Recursion;
import java.util.Scanner;

class Position {
    String ab="int findPos(int)";
	static int x=1;
	public static int findPos(int pos) {
	    x=x*2;
	    if(pos>x)
	    {
	        return findPos(pos);
	    }
	    if(pos==x){return x;}
	    return x/2;

	}
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(findPos(n));
        sc.close();
	}
}