package examly.Strings;
import java.util.*;
public class camelcase {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String str1="";
        String[]a=str.split(" ");
        for(String i:a){
            str1+=(i.substring(0,1).toUpperCase())+i.substring(1);
        }
        System.out.print(str1);
        sc.close();
    }
}

