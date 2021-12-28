package Advance;
import java.util.*;
public class primeseries {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []ar=new int[a+1];
        ArrayList<Integer> ls=new ArrayList<>();
        int lmt=(int)Math.sqrt(a);
        for(int i=2;i<=a;i++){
            if(ar[i]==0){
                if(i<=lmt)
                    for(int j=2*i;j<=a;j+=i)
                        ar[j]=1;
                ls.add(i);
            }
        }
        for(int i:ls){
            System.out.println(i);
        }
        sc.close();
    }
    
}
