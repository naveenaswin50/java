package examly.conditional;
import java.util.*;
public class teamevent {
    public static void main(String[]sa){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean flag=true;
        if(a<=9){
            System.out.print("Invalid Input");
            flag=false;
        }
        if(flag){
            int b=a%10,c=0;
            while(a!=0){
                c=a%10;
                a/=10;
            }
            if(b>c)
                System.out.println(b-c);
            else
                System.out.print(c-b);
        }
        sc.close();
    }
}

