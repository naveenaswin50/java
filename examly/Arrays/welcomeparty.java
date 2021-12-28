package examly.Arrays;
import java.util.*;
public class welcomeparty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashSet<Integer> HS=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            HS.add(arr[i]);
        }
        int Max=0;
        for(int i:HS)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(i==arr[j])
                    count++;
            }
            if(Max<count)
            {
                Max=count;
            }
        }
        System.out.print(arr.length-Max);
        sc.close();
    }
}
