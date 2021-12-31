package examly.inheritance;
import java.util.Scanner;

class Visa {
    String holder;
    String ccv;
    Visa(String a,String b){
        this.holder=a;
        this.ccv=b;
    }
    public Double computeRewardPoints(String purchaseType, Double amount){
        return (amount*(0.01));
    }
}

class HPVisa extends Visa{
    HPVisa(String a,String b){
        super(a,b);
    }
    @Override
    public Double computeRewardPoints(String purchaseType, Double amount) {
        return (super.computeRewardPoints(purchaseType, amount)+10);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextInt();
        sc.nextLine();
        String d = sc.nextLine();
        int e = sc.nextInt();
        if(e==1){
           Visa x = new Visa(a, b);
           System.out.printf("%.1f",x.computeRewardPoints(d,c));
        }
        else if(e==2){
           Visa x = new HPVisa(a, b);
           System.out.printf("%.1f",x.computeRewardPoints(d,c));
        }
        else{
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}

 
