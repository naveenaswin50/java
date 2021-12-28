package examly.arrays2A;
import java.util.*;
public class whitecell {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt(),count=0;
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]!=20){
                    count+=arr[i][j];
                }
            }
        }
        System.out.print(count);
        sc.close();
    }
}
