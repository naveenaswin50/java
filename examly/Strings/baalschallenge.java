package examly.Strings;
import java.util.*;
public class baalschallenge {
    public static void main(String [] args) {
	    int i,c=0;
	    String str1,str2;
	    Scanner sc = new Scanner(System.in);
	    str1 = sc.next();
	    str2 = sc.next();
        sc.close();
	    for(i=0;i<str1.length();i++)
	    {
	        if(str1.charAt(i)==str2.charAt(i))
	        {
	        	if(str1.charAt(i) == 87) {
	        		System.out.print("B");
	        	}
	        	else {
	        		System.out.print("W");
	        	}
	        }
	        else
	        {
	            c++;
	            if(c%2 == 0) {
	            	System.out.print(str2.charAt(i));
	            }
	            else {
	            	System.out.print(str1.charAt(i));
	            }
	        }
	    }
	}
}
