package examly.OOPS.OOPSA;
import java.util.Scanner;
public class Country {
    private String name;
    private String code;
    private String isd;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setcode(String code){
        this.code=code;
    }
    public String getcode(){
        return code;
    }
    public void setisd(String isd){
        this.isd=isd;
    }
    public String getisd(){
        return isd;
    }
    void display(){
        System.out.println("Country Name : "+name);
        System.out.println("Country Code : "+code);
        System.out.println("ISD Code : "+isd);
    }
}
class Countrymain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Country a=new Country();
        a.setname(sc.next());
        a.setcode(sc.next());
        a.setisd(sc.next());
        a.display();
        sc.close();
    }
}