package Advance;
import java.util.*;
public class Cricket{
    String Name;
    int score;
    String opp;

    public Cricket(String Name, int score, String opp) {
        this.Name = Name;
        this.score = score;
        this.opp = opp;
    }
    public Cricket(){
    }
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        Cricket[] arr = new Cricket[a];
        for (int i = 0; i < a; i++) {
            arr[i] = new Cricket();
            arr[i].Name = sc.nextLine();
            arr[i].score = sc.nextInt();
            sc.nextLine();
            arr[i].opp = sc.nextLine();
        }
       for(int i=0;i<a;i++){
           for(int j=0+i;j<a;j++){
               if(arr[i].score>arr[j].score){
                Cricket temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
               }
               if(arr[i].score==arr[j].score){
                  if(arr[i].Name.compareTo(arr[j].Name)>0){
                      Cricket temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                  }
                }
                if(arr[i].Name==arr[j].Name){
                    if(arr[i].opp.compareTo(arr[j].opp)>0){
                        Cricket temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                    }
                }
            }
           
        }
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i].Name + " " + arr[i].score + " " + arr[i].opp);
        }
        sc.close();
// String s = "A";
//         String s2 = "B";
//         System.out.println(s.compareTo(s2));
    }

}
