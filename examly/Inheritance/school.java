package examly.inheritance;
import java.util.*;
class Person{
    String name;
    String birYear;
    Person(String a,String b){
        this.name=a;
        this.birYear=b;
    }
}
class Student extends Person{
    String dep;
    int Aper;
    Student(String a,String b,String c,int d){
        super(a,b);
        this.dep=c;
        this.Aper=d;
    }
    @Override
    public String toString(){
        System.out.println("Name : "+name);
        System.out.println("BirthYear : "+birYear);
        System.out.println("Department : "+dep);
        return "n";
    }
    public void test(){
        if(Aper<75){
            System.out.println("Eligible : No");
        }else{
            System.out.println("Eligible : Yes");
        }
    }
}
class Staff extends Person{
    int salary;
    Staff(String a, String b,int c) {
        super(a, b);
        this.salary=c;
    }
}
class TStaff extends Staff{
    String subject;
    int Rper;
    TStaff(String a, String b, int c,String d,int e) {
        super(a, b, c);
        this.subject=d;
        this.Rper=e;
    }
    @Override
    public String toString(){
        System.out.println("Name : "+name);
        System.out.println("BirthYear : "+birYear);
        System.out.println("Old Salary : "+(float)(salary));
        System.out.println("Subject : "+subject);
        return "n";
    }
    public void calculate(){
        float sal=this.salary,per=(float) (this.Rper/1000.0),newSal=0,inc=0;
        inc=sal*per;
        newSal=sal+inc;
        System.out.println("New Salary : "+newSal);
    }
}
class NTStaff extends Staff{
    String lab;
    int exp;
    NTStaff(String a, String b, int c,String d,int e) {
        super(a, b, c);
        this.lab=d;
        this.exp=e;
    }
    @Override
    public String toString(){
        System.out.println("Name : "+name);
        System.out.println("BirthYear : "+birYear);
        System.out.println("Old Salary : "+(float)(salary));
        System.out.println("Lab : "+lab);
        return "n";
    }
    public void calculate(){
        float sal=this.salary,per=(float) (this.exp/100.0),newSal=0,inc=0;
        inc=sal*per;
        newSal=sal+inc;
        System.out.println("New Salary : "+newSal);
    }
}
class School{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(n==1){
            String c=sc.nextLine();
            int d=sc.nextInt();
            Student z=new Student(a, b, c, d);
            z.toString();
            z.test();
        }
        else if(n==2){
            String d=sc.nextLine();
            int e =sc.nextInt();
            int c=sc.nextInt();
            TStaff z=new TStaff(a, b, c, d, e);
            z.toString();
            z.calculate();
        }
        else if(n==3){
            String d=sc.nextLine();
            int e =sc.nextInt();
            int c=sc.nextInt();
            NTStaff z=new NTStaff(a, b, c, d, e);
            z.toString();
            z.calculate();
        }
        sc.close();
    }
}