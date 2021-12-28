package examly.stringsA;
import java.util.*;
public class authors {
    static public void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[26];
        int max=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            int tp=(int)((s.charAt(i))-97);
            arr[tp]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        if((sum-max)==max){
            System.out.println("Yes");
        }
        else{
            System.out.print("No");
        }
        sc.close();
    }
}
