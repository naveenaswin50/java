package Algorithm;
import java.util.*;
public class bubblesorting {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i;j<a;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
        sc.close();
    }
}
