package examly.function;

import java.util.Scanner;

public class expression {
    static int calculate(int a,int b){
        int sum=0;
        for(int i=1;i<=b;i++){
            sum+=Math.pow(a,i);
        }
        return sum;
    }
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(calculate(a,b));
        sc.close();
    }
}
