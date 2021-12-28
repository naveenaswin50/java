package examly.arrays2;
import java.util.*;
public class age2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        int[] arr1=new int[r];
        for(int i=0;i<r;i++)
        {
            int a=0;
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
                a+=arr[i][j];
            }
            arr1[i]=a/c;
        }
        int x=sc.nextInt();
        int count=0;
        for(int i:arr1)
        {
            if(i>x)
            {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
