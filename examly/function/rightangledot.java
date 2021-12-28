package examly.function;
import java.util.Scanner;
public class rightangledot {

    static boolean series(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(sum<n){
                sum+=i;
            }else{
                break;
            }
        }
        if(sum==n)return true;
        return false;
    }
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        if(series(n)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
