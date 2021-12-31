package examly.RecursionA;
import java.util.*;
public class Reverse {
    String ad="int reverse(int)";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
