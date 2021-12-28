import java.util.*;
public class Patten {
    public static void main(String[]ad){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("+ ");
        }
        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("+ ");
        }
        s.close();
    }
}
