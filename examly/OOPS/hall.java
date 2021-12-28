package examly.OOPS;
import java.util.*;
public class hall{
    String name;
    String no;
    Double cpd;
    String oname;
    public hall(String name,String no,Double cpd,String oname){
        this.name=name;
        this.no=no;
        this.cpd=cpd;
        this.oname=oname;
    }
    public hall(){}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hall []arr=new hall[2];
        for(int i=0;i<2;i++){
            arr[i]=new hall();
            arr[i].name=sc.next();
            arr[i].no=sc.next();
            arr[i].cpd=sc.nextDouble();
            arr[i].oname=sc.next();
        }
        if(arr[0].name.equals(arr[1].name) && arr[0].no.equals(arr[1].no) && arr[0].cpd.equals(arr[1].cpd) && arr[0].oname.equals(arr[1].oname)){
            System.out.print("Halls are same");
        }else{
            System.out.print("Halls are different");
        }
        sc.close();
    }
}
/*import java.util.Scanner;

class Cons {
    String name;
    String ph_no;
    String cost;
    String oname;

    Cons(String name,String ph_no,String cost,String oname){
        this.name=name;
        this.ph_no=ph_no;
        this.cost=cost;
        this.oname=oname;
    }

    Cons(){}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cons[] con=new Cons[2];
        for(int i=0;i<2;i++)
        {
            con[i]=new Cons();
            con[i].name=sc.next();
            con[i].ph_no=sc.next();
            con[i].cost=sc.next();
            con[i].oname=sc.next();
        }
        if(con[0].name.equals(con[1].name) && con[0].ph_no.equals(con[1].ph_no) && con[0].cost.equals(con[1].cost) && con[0].oname.equals(con[1].oname))
        {
            System.out.print("Halls are same");
        }
        else
        {
            System.out.print("Halls are different");
        }
        sc.close();
    }
}*/