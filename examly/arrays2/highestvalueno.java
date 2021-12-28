package examly.arrays2;
import java.util.*;
public class highestvalueno {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int arr[][]=new int [a][a];
        int max=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]!=20){
                    if(max<arr[i][j]){
                        max=arr[i][j];
                    }
                }
            }
        }
        System.out.print(max);
        sc.close();
    }
}
