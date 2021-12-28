package examly.functiona;
import java.util.*;
public class recreation {
    int findValue(int a,int b){
        int k=0;
        if(a<b){
            for(int i=a;i>=1;i--){
                if(a%i==0 && b%i==0){
                    k=i;
                    break;
                }
            }
        }else{
            for(int i=b;i>=1;i--){
                if(a%i==0 && b%i==0){
                    k=i;
                    break;
                }
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        recreation s=new recreation();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(s.findValue(a,b));
        sc.close();
    }
}
