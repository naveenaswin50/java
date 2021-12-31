import java.util.*;
class TicketBooking{
    String stage;
    String customer;
    int noofset;
    TicketBooking(String a,String b,int c){
        this.stage=a;
        this.customer=b;
        this.noofset=c;
    }
    public void makePayment(Double amount){
        System.out.print(stage+" "+customer+" "+noofset+" "+amount);
    }
    public void makePayment(String walletNumber ,Double amount){
        System.out.print(stage+" "+customer+" "+noofset+" "+amount+" "+walletNumber);
    }
    public void makePayment(String creditCard,String ccv,String name,Double amount){
        System.out.print(stage+" "+customer+" "+noofset+" "+name+" "+amount+" "+creditCard+" "+ccv);
    }
}
class overloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(",");
        String a=arr[0];
        String b=arr[1];
        int c=Integer.parseInt(arr[2]);
        int n=sc.nextInt();
        TicketBooking z=new TicketBooking(a, b, c);
        if(n>0&&n<4){
            if(n==1){
                double d=sc.nextDouble();
                z.makePayment(d);
            }else if(n==2){
                double d=sc.nextDouble();
                sc.nextLine();
                String e=sc.nextLine();
                z.makePayment(e,d);
            }else if(n==3){
                sc.nextLine();
                String e=sc.nextLine();
                double d=sc.nextDouble();
                sc.nextLine();
                String f=sc.nextLine();
                String g=sc.nextLine();
                z.makePayment(f, g, e, d);
            }
        }else{
            System.out.println("Invalid Choice");
        }
    }
}
