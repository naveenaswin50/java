package examly.loopsA;
import java.util.Scanner;
public class Aes {
    static boolean isAes(int n){
        int c=0;
        for(int i=n/2;i>=1;i--){
            if(n%i==0){
                c++;
            }
        }
        if(++c==4)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        sc.close();
        int c=0;
        for(int i=s;i<=e;i++){
            if(isAes(i))c++;
        }
        System.out.println(c);
    }
}