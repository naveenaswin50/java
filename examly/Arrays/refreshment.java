package examly.Arrays;
import java.util.*;
public class refreshment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)System.out.println("Invalid Input");
        List<Integer> arr=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
            if(arr.get(i)<0){
                System.out.print("Invalid Input");
                break;
            }
            else{
                sum+=arr.get(i);
            }
        }
        if(arr.size()==n){
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("\n"+sum);
    }
    sc.close();
    }
}
