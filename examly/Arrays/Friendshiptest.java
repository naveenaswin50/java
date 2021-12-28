package examly.Arrays;
import java.util.*; 
public class Friendshiptest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> HS=new HashSet<>();
        for(int i=0;i<n;i++)
            HS.add(sc.nextInt());
        System.out.print(HS.size());
        sc.close();
    }
}
