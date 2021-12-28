package Practise;
import java.util.*;
public class suma1{
    static public void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            for(int j:arr){
                if(i+j==a){
                    i=0;
                    j=0;
                    System.out.println(i+" "+(j));
                }
            }
        }
        sc.close();
    }
}