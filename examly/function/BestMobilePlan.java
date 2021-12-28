package examly.function;
import java.util.*;
public class BestMobilePlan {
    static void printPlanDetails(double a,double b,double c){
        double A=0,B=0;
        if((a-100)<0){
            A=b*0.15+c*0.20;
            System.out.printf("Plan A costs "+"%.2f",A);
        }else{
            A=(a-100)*0.25+b*0.15+c*0.20;
            System.out.printf("\nPlan A costs "+"%.2f",A);
        }if((a-250)<0){
            B=b*0.35+c*0.25;
            System.out.printf("\nPlan B costs "+"%.2f",B);
        }else{
            B=(a-250)*0.45+b*0.35+c*0.25;
            System.out.printf("\nPlan B costs "+"%.2f",B);
        }
        if((float)A==(float)B){
            System.out.print("\nPlan A and B are the same price");
        }else if(A<B&&A!=B){
            System.out.print("\nPlan A is cheapest");
        }else if(B<A&&A!=B){
            System.out.print("\nPlan B is cheapest");
        }
    }
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        printPlanDetails(a,b,c);
        sc.close();
    }
}

