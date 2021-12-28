package examly.Recursion;

import java.util.Scanner;

public class Candyquiz {
class Factorial {
    String ab="long lastNonZeroDigit(int)";
	static int s;
	public static long lastNonZeroDigit(long num) {
	    if(s==0)
	    {
	        int i;long fact=1;
	        for(i=1;i<=num;i++)
	        {
	            if(fact%10==0){fact=fact/10;}
	            if(fact>1000000000){fact=fact%1000;}
	            fact=fact*i;
	        }
	        num=fact;
	        s=1;
	    }
	    if(num%10==0){return lastNonZeroDigit(num/10);}
	    return Math.abs(num%10);

	}
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(lastNonZeroDigit(n));
        sc.close();
        
	}
}

}
