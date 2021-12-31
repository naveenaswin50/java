package examly.OOPS.OOPSA.OOPS1;
import java.util.*;
public class singlefile3 {
    String name;
    String m_no;
    String uname;
    String pwd;
    String av="public void displayAll(User[] userArray)";
    String bb="public Boolean deleteUser(User[] userArrray,String name)";
    public singlefile3(String name,String m_no,String uname,String pwd){
        this.name=name;
        this.m_no=m_no;
        this.uname=uname;
        this.pwd=pwd;
    }
    public singlefile3(){}
    public void display(singlefile3 arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].m_no+" ");
            System.out.print(arr[i].uname+" ");
            System.out.println(arr[i].pwd);
        }
    }
    public boolean compair(singlefile3 arr[],String str,int n){
        for(int i=0;i<n;i++){
            if(arr[i].name.equals(str)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        singlefile3 arr[]=new singlefile3[n];
        for(int i=0;i<n;i++){
            arr[i]=new singlefile3();
            arr[i].name=sc.next();
            arr[i].m_no=sc.next();
            arr[i].uname=sc.next();
            arr[i].pwd=sc.next();
        }
        sc.close();
        String str=sc.next();
        singlefile3 a=new singlefile3();
        a.display(arr,n);
        if(a.compair(arr,str,n)){
            System.out.println("User deleted successfully");
        }else{
            System.out.println("No user found with the given name");            
        }
    }       
}
