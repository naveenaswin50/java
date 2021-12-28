package examly.conditional;
import java.util.*;
public class carrom {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        boolean flag=true;
        if(a<=0||a>=10){
            System.out.print("Invalid input");
            flag=false;
        }
        if(flag){
        char b= sc.next().charAt(0);
        if(b=='y'&&a>0&&a<10&&flag){
            System.out.print(a+5);
        }else if(b=='n'&&a>0&&a<10&&flag){
            System.out.print(a);
        }
        sc.close();
    }
        
    }
} 
