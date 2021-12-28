package examly.functiona;
import java.util.*;
public class eventvalue {
    static boolean findvalue(String str,String str1){
        if(str1.equals(str.substring(str.length()-str1.length()))){
            return true;
        }
        return false;
    }
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(findvalue(a,b)){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
        sc.close();
    }
}
