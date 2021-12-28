package examly.OOPS.OOPSA.OOPS1;
import java.util.*;
public class Singlefile {
    String name;
    String no;
    public Singlefile(String name,String no){
        this.name=name;
        this.no=no;
    }
    public Singlefile(){}
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        Singlefile arr[]=new Singlefile[n];
        for(int i=0;i<n;i++){
            arr[i]=new Singlefile();
            arr[i].name=sc.next();
            arr[i].no=sc.next();
        }
        String str=sc.next();
        int k=str.length();
        for(int i=0;i<n;i++){
            if(str.equals(arr[i].name.substring(0,k))){
                System.out.print(arr[i].name+" ");
                System.out.println(arr[i].no);
            }
        }
        sc.close();
    }    
}
