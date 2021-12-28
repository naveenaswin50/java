package examly.stringsA;
import java.util.*;
public class number {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                a++;
            }
            else{
                b++;
            }
        }
        if(a==1 || b==1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        sc.close();
    }
}

