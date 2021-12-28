package examly.Strings;
import java.util.*;
public class validemail {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        if(email.contains(".com")||email.contains(".org")||email.contains(".net")||email.contains(".in")){
            System.out.print("Valid email address");
        }else{
            System.out.print("Invalid email address");
        }
        sc.close();
    }
}
