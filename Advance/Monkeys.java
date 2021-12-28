package Advance;
import java.util.*;
public class Monkeys {
    private static Scanner sc;
    private static int gcd(int a,int b){
        if(a%b==0)
            return b;
        else
            return gcd(b,a%b);
    }
    private static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String args[]){
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++)
            ar.add(sc.nextInt());
        int res = 1;
        for(int i=0;i<n;i++){
            if(ar.get(i) != -1){
                int ind = i;
                int count = 0;
                while(ar.get(ind)!=-1){
                    count++;
                    int temp = ind;
                    ind = ar.get(ind)-1;
                    ar.set(temp, -1);
                }
                if(count!=0)
                    res = lcm(res,count);    
            }
        }
        System.out.println(res);
    }
}
