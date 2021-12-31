package examly.inheritance;
import java.util.*;
class SilverStall {
    String name;
    String detail;
    String owner;
    int cost;
    SilverStall(String a,String b,String c,int d){
        this.name=a;
        this.detail=b;
        this.owner=c;
        this.cost=d;
    }
    void display(){
        System.out.println(cost);
    }
}
class GoldStall extends SilverStall{
    int tvSet;
    GoldStall(String a, String b, String c, int d,int e) {
        super(a, b, c, d);
        this.tvSet=e*100;
    }    
    void display(){
        System.out.println(cost+tvSet);
    }
}
class PlatinumStall extends GoldStall{
    int projector;
    PlatinumStall(String a, String b, String c, int d, int e,int f) { 
        super(a, b, c, d, e);
        this.projector=f*500;
    }
    void display(){
        System.out.println(cost+tvSet+projector);
    }
}
class Mulitlevel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<4 && n>0){
            sc.nextLine();
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            if(n==1){
                int d=sc.nextInt();
                SilverStall z=new SilverStall(a, b, c, d);
                z.display();
            }
            else if(n==2){
                int d=sc.nextInt();
                int e=sc.nextInt();
                GoldStall z=new GoldStall(a, b, c, d, e);
                z.display();
            }
            else if(n==3){
                int d=sc.nextInt();
                int e=sc.nextInt();
                int f=sc.nextInt();
                PlatinumStall z=new PlatinumStall(a, b, c, d, e, f);
                z.display();
            }
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}