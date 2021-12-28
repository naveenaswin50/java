import java.util.Scanner;

public class Questionpaper{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int del=0,div=0;
        int shift=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        div=sum/n;
        del=sum-(div*n);
        for(int i=0;i<n;i++){
            if(arr[i]<div){
                while(div!=arr[i]){
                    arr[i]++;
                    shift++;
                }
            }
            else if(arr[i]>div){
                arr[i]=div;
            }
            
        }
        System.out.println(del+" "+shift);
        sc.close();
        
    }
}