package examly.inheritance;
import java.util.*;
class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String org;
    Event (String a,String b,String c,String d){
        this.name=a;
        this.detail=b;
        this.type=c;
        this.org=d;
    }
}
class Exhibition extends Event{
    private int noStall;
    Exhibition(String a, String b, String c, String d,int e) {
        super(a, b, c, d);
        this.noStall=e;
    }
    void display(){
        System.out.print(name+" ");
        System.out.print(detail+" ");
        System.out.print(type+" ");
        System.out.print(org+" ");
        System.out.print(noStall+" ");
    }
}
class StageEvent extends Event{
    private int noStall;
    StageEvent(String a, String b, String c, String d,int e) {
        super(a, b, c, d);
        this.noStall=e;
    }
    void display(){
        System.out.print(name+" ");
        System.out.print(detail+" ");
        System.out.print(type+" ");
        System.out.print(org+" ");
        System.out.print(noStall+" ");
    }
}
class Super{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3&&n>0){
            sc.nextLine();
            String str=sc.nextLine();
            String arr[]=str.split(",");
            if(n==1){
                String a=arr[0];
                String b=arr[1];
                String c=arr[2];
                String d=arr[3];
                int e=Integer.parseInt(arr[4]);
                Exhibition z=new Exhibition(a, b, c, d, e);
                z.display();
            }
            else if(n==2){
                String a=arr[0];
                String b=arr[1];
                String c=arr[2];
                String d=arr[3];
                int e=Integer.parseInt(arr[4]);
                Exhibition z=new Exhibition(a, b, c, d, e);
                z.display();
            }
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}