package examly.OOPS.OOPSA.OOPS1;
import java.util.*;
public class requirment {
    String name;
    String qua;
    String gen;
    int exp;
    public requirment(String name,String qua,String gen,int exp){
        this.name=name;
        this.qua=qua;
        this.gen=gen;
        this.exp=exp;
    }
    public requirment(){}
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        requirment arr[]=new requirment[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            arr[i]=new requirment();
            arr[i].name=sc.nextLine();
            arr[i].qua=sc.nextLine();
            arr[i].gen=sc.nextLine();
            arr[i].exp=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i].exp>arr[j].exp){
                    requirment tp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tp;
                }
                if(arr[i].exp==arr[j].exp){
                    if((arr[i].name).compareTo(arr[j].name)>0){
                        requirment tp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tp;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i].name);
            System.out.println(arr[i].qua);
            System.out.println(arr[i].gen);
            System.out.println(arr[i].exp);
        }
        sc.close();
    }
}
