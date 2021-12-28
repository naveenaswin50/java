package examly.Arrays;
import java.util.*;
public class bestcouple {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		int res=0;
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			res=res^a[i];
		}
		System.out.println(res);
        in.close();
	} 
}
