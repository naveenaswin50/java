package examly.OOPS;
import java.util.*;
public class StallCategory {
    private String name;
    private String detail;
    StallCategory(String name,String detail){
        this.name=name;
        this.detail=detail;
    }
    StallCategory(){}
    void display(){
        System.out.println("Using Default Constructor\nUsing Parameterized Constructor");
        System.out.println(name+"\n"+this.detail);
    }
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        StallCategory a =new StallCategory();
        a.name=sc.nextLine();
        a.detail=sc.nextLine();
        a.display();
        sc.close();
    }
}
