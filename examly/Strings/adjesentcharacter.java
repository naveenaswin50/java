package examly.Strings;
import java.util.*;
public class adjesentcharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length()-1;i++){
            System.out.print(a.charAt(i));
            if(a.charAt(i)==a.charAt(i+1))
                System.out.print("*");
        }
        System.out.print(a.charAt(a.length()-1));
        sc.close();
    }
}