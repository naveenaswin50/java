package examly.stringsA;
import java.util.*;
public class peterchallenge {
    static public void main(String[] r){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int won=0;
        for(char i:s.toCharArray()){
            if(i=='0'){
            }
            else{
                won++;
            }
        }
        if(won>=(s.length()-won)){
            System.out.println("Win");
        }
        
        if(won<11){
            System.out.println("Lose");
        }
        sc.close();
    }
}
/* You are using Java
import java.util.*;
class sol{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                c++;
            }
        }
        if(c>=11){
            System.out.print("Win");
        }else{
            System.out.print("Lose");
        }
    }
}*/
