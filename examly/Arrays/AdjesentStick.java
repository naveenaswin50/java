package examly.Arrays;
import java.util.*;
public class AdjesentStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i+=2){
            if(arr[i]>arr[i+1] || arr[i+1]==arr[i]){
                arr[i]=0;
            }
            else{
                arr[i+1]=0;
            }
        }
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}
