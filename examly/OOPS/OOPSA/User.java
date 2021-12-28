package examly.OOPS.OOPSA;
import java.util.*;
public class User {
    String name;
    String uname;
    String pws;
    String no;
    public User(String name,String uname,String pws,String no){
        this.name=name;
        this.uname=uname;
        this.pws=pws;
        this.no=no;
    }
    public User(){}
}
class sol{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=2;
        User arr[]=new User[2];
        for(int i=0;i<n;i++){
            arr[i]=new User();
            arr[i].name=sc.next();
            arr[i].uname=sc.next();
            arr[i].pws=sc.next();
            arr[i].no=sc.next();
        }
        if(arr[0].no.equals(arr[1].no)){
            System.out.println("User 1 and User 2 are equal");
        }else{
            System.out.println("User 1 and User 2 are not equal");
        }
        sc.close();
    }
}
