package examly.stringsA;
import java.util.*;
public class colorfullbaloons {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        int ac=0,bc=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                ac++;
            }else if(str.charAt(i)=='b'){
                bc++;
            }
        }
        if(ac<bc){
            System.out.print(ac);
        }else{
            System.out.print(bc);
        }
        sc.close();
    }
}
