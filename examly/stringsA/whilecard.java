package examly.stringsA;
import java.util.*;
public class whilecard {
    
    static boolean check(String a,String b){
        if(a.length()!=b.length())return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                if(a.charAt(i)=='?' || b.charAt(i)=='?'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    static public void main(String[] ae){
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        boolean res=check(a,b);
        if(res){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    } 
}
