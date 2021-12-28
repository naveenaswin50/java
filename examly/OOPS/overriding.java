package examly.OOPS;
import java.util.*;
class overriding{
    String add1;
    String add2;
    String city;
    String state;
    int pincode;
    public void setadd1(String add1){
        this.add1=add1;
    }
    String getadd1(){
        return this.add1;
    }
    public void setadd2(String add2){
        this.add2=add2;
    }
    String getadd2(){
        return this.add2;
    }
    public void setcity(String city){
        this.city=city;
    }
    String getcity(){
        return this.city;
    }
    public void setstate(String state){
        this.state=state;
    }
    String getstate(){
        return this.state;
    }
    public void setpincode(int pincode){
        this.pincode=pincode;
    }
    int getpincode(){
        return this.pincode;
    }
    @Override
    public String toString(){
        // System.out.println(getadd1());
        // System.out.println(getadd2());
        // System.out.println(getcity());
        // System.out.println(getstate());
        // System.out.println(getpincode());
        return getadd1()+"\n"+getadd2()+"\n"+getcity()+"\n"+getstate()+"\n"+getpincode();
    }
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        overriding a=new overriding();
        a.setadd1(sc.nextLine());
        a.setadd2(sc.nextLine());
        a.setcity(sc.nextLine());
        a.setstate(sc.nextLine());
        a.setpincode(sc.nextInt());
        System.out.println(a);
        sc.close();
    }
}
