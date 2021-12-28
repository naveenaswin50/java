package examly.Strings;
import java.util.*;
public class mobilenum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine();
        String n=number.substring(0,3);
        if(n.compareTo("+91")==0 && (number.length()-n.length())==10)
          System.out.println("Mobile number valid");
        else
          System.out.println("Mobile number invalid");
        sc.close();
    }
}

