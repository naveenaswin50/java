package examly.OOPS;
import java.util.*;
public class getter {
    String abc="setName()";
    String cbc="getName()";
    String bbc="display()";
    // static Main a=new Main();
    private String name;
    private Double dep;
    private Double cpd;
    public getter(String name,Double dep,Double cpd){
        this.name=name;
        this.dep=dep;
        this.cpd=cpd;
    }
    public getter(){}
    void display(){
        System.out.println(this.name);
        System.out.println(this.dep);
        System.out.println(this.cpd);
    }
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        getter a=new getter();
        a.name=sc.next();
        a.dep=sc.nextDouble();
        a.cpd=sc.nextDouble();
        a.display();
        sc.close();
    }
}
/*import java.util.*;
class Main{
    static Main a=new Main();
    private String name;
    private Double dep;
    private Double cpd;
    String abc="setName()";
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setDep(Double dep){
        this.dep=dep;
    }
    public Double getDep(){
        return this.dep;
    }
    public void setCpd(Double cpd){
        this.cpd=cpd;
    }
    public Double getCpd(){
        return this.cpd;
    }
    void display(){
        System.out.print(a.getName());
        System.out.print("\n"+a.getDep());
        System.out.print("\n"+a.getCpd());
    }
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        a.setName(sc.next());
        a.setDep(sc.nextDouble());
        a.setCpd(sc.nextDouble());
        a.display();
    }
}*/
