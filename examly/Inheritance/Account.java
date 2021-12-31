package examly.inheritance;
import java.util.*;
public class Account {
    protected String Aname;
    protected String Acno;
    protected String Bname;
    public Account(String a, String b, String c) {
        this.Aname=a;
        this.Acno=b;
        this.Bname=c;
    }

}
class CurrentAccount extends Account
{
    String tinno;
    public CurrentAccount(String a,String b,String c,String d){
        super(a,b,c);
        this.tinno=d;
    }
    void display(){
        System.out.println(Aname);
        System.out.println(Acno);
        System.out.println(Bname);
        System.out.println(tinno);
    }
}
class SavingsAccount extends Account{
    String OName;
    public SavingsAccount(String a,String b,String c,String d){
        super(a,b,c);
        this.OName=d;
    }
    void display(){
        System.out.println(Aname);
        System.out.println(Acno);
        System.out.println(Bname);
        System.out.println(OName);
    }
}
class BankAccount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        if(n==1){
            String d=sc.next();
            CurrentAccount z=new CurrentAccount(a, b, c, d);
            z.display();
        }else if(n==2){
            String d=sc.next();
            SavingsAccount x=new SavingsAccount(a, b, c, d);
            x.display();
        }
        sc.close();
    }
}
