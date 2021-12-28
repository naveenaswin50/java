package examly.Strings;
import java.util.*;
public class alternatingcode {
    public static void main(String[] as){
        Scanner sc=new Scanner (System.in);
        String str=sc.next();
        HashSet<Character> s=new HashSet<>();
        for(int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }
        if(s.size()==2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        sc.close();
    }
}
