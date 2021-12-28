package examly.OOPS;
import java.util.*;
public class Arraysobj {
    String abc="public void search(String search, ItemType[] itemTypeArray)";
    String ac="public void display(ItemType[] itemTypeArray)";
    private String name;
    private double dep;
    private double cpd;
    public Arraysobj(String name,double dep,double cpd){
        this.name=name;
        this.dep=dep;
        this.cpd=cpd;
    }
    public Arraysobj(){}
    public void display(Arraysobj arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].dep+" ");
            System.out.println(arr[i].cpd);
        }
    }
    public void search(Arraysobj arr[],String str){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(str.equals(arr[i].name)){
                System.out.print(arr[i].name+" ");
                System.out.print(arr[i].dep+" ");
                System.out.println(arr[i].cpd);
                flag=false;
                break;
            }else{
                flag=true;
            }
        }
        if(flag){
            System.out.println("Searched item Type not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Arraysobj a=new Arraysobj();
        Arraysobj[]arr=new Arraysobj [n];
        for(int i=0;i<n;i++){
            arr[i]=new Arraysobj();
            arr[i].name=sc.next();
            arr[i].dep=sc.nextDouble();
            arr[i].cpd=sc.nextDouble();
        }
        String str=sc.next();
        a.search(arr,str);
        a.display(arr);
        sc.close();
    }
    
}
