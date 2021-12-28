package examly.arrays2;
import java.util.*;
public class collision {
    static public void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c=sc.nextInt();
        int d=0;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            int tp=0;
            for(int j=0;j<r;j++){
                tp+=arr[j][i];
            }
            d+=((tp*(tp-1))/2);
        }
        System.out.println(d);
        sc.close();
    }
}
