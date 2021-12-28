package examly.function;

import java.util.Scanner;

public class Addision {
    int calculate(int a){
        int sum=0;
        for(int i=0;i<=a;i++){
            sum+=Math.pow(2,i);
        }
        return sum;
    }
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Addision z=new Addision();
        System.out.print(z.calculate(a));
        sc.close();
    }
}