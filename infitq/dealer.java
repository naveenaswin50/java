package infitq;
import java.util.*;
public class dealer {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
          arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int declar=0;
        for(int i=1;i<a;i++){
          if(arr[i]<min){
            declar=i;
          }
        }
        System.out.print("dealer"+declar);
        sc.close();
    }
}