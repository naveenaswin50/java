package examly.function;
import java.util.Scanner;
public class BestProgramer {
class NumberType{
    static void findType(int a){
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0)sum+=i;
            }if(a==sum)
                System.out.print(a+" is a perfect number");
            else if(sum>a)
                System.out.print(a+" is a abundant number");
            else if(sum<a)
                System.out.print(a+" is a deficient number");
        }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        findType(a);
        sc.close();
    }
}
}
