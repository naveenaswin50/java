package examly.Arrays;
import java.util.*;
public class Bobschallange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max=0;int sm=0;
        if(n<4){
            System.out.println("-1");
        }
        else{
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                max=arr[i];break;
            }
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1] && arr[i]!=max){
                sm=arr[i];break;
            }
        }
        }
        if(max!=0 && sm!=0){
            System.out.println(max*sm);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    
    }
}
