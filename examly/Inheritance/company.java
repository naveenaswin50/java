package examly.inheritance;
import java.util.*;
class person {
    String name;
    person(String a){
        this.name=a;
    }
    void display(){
        System.out.println(name);
    }
}
class Staff extends person{
    int Staffid;
    Staff(String a,int b) {
        super(a);
        this.Staffid=b;
    }
    void display(){
        System.out.println(name);
        System.out.println(Staffid);
    }
}
class TStaff extends Staff{
    int day;
    int HW;
    TStaff(String a, int b,int c,int d) {
        super(a, b);
        this.day=c;
        this.HW=d;
    }
    void claculate(){
        int TS=0;
        TS=this.day*HW*50;
        System.out.println("Total Salary : "+TS);
    }
    public void display() {
        System.out.println("Name : "+this.name);
        System.out.println("Staff Id : "+this.Staffid);
        System.out.println("No. of Days : "+this.day);
        System.out.println("No. of Hours Worked : "+this.HW);
    }
}
class company{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        TStaff z=new TStaff(a, b, c, d);
        z.display();
        z.claculate();
        sc.close();
    }
}