// You are using Java

import java.util.Scanner;
class  AdditionChallenge  {
    long findSum(int a){
        long sum=0;
        for(int i=0;i<=a;i++){
            sum+=Math.pow(2,i);
        }
        return sum;
    }
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        AdditionChallenge z=new AdditionChallenge();
        System.out.print(z.findSum(a));
        sc.close();
    }
}
