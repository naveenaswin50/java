package Practise;
import java.util.*;
class sol{
    static void findval(int a){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int dif=0;
        int ans=0;
        dif=(arr[0]-arr[a-1])/a;
        for(int i=0;i<a;i++){
            if(arr[i+1]-arr[i]!=dif){
                ans=arr[i]+dif;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            findval(b);
        }
        sc.close();
    }
}