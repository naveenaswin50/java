package examly.loopsA;
import java.util.*;
public class count {
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt(),even=0,odd=0;
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    even++;
                }else{
                    odd++;
                    
                }
            }
            System.out.print(even+" "+odd);
        sc.close();
    }
}
