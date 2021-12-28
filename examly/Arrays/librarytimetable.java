package examly.Arrays;
import java.util.*;
public class librarytimetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n+1];
        int[] b=new int[n];
        a[0]=0;
        int c=0;
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if((a[i+1]-a[i])>=b[i]){
                c++;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
