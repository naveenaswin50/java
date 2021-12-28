package examly.Strings;
import java.util.*;
public class casper {
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Boolean flag=true;
        String []str=new String[a];
        for(int i=0;i<a;i++){
            str[i]=sc.next();
        }for(int i=0;i<a-1;i++){
            if(str[i].equals("cookie")&&(str[i+1].equals("cookie"))){
                System.out.print("NO");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.print("YES");
        }

       sc.close(); 
    }
}
