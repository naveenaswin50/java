package examly.loops;
import java.util.*;
public class dialy {
    public static void main(String[]as){
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int n=s.length(),count=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='C'&&(s.charAt(i+1)=='C'||s.charAt(i+1)=='E'||s.charAt(i+1)=='S')){
                count++;
            }
            if(s.charAt(i)=='E'&&(s.charAt(i+1)=='E'||s.charAt(i+1)=='S')){
                count++;
            }
            if(s.charAt(i)=='S'&&s.charAt(i+1)=='S'){
                count++;
            }
        }
        if(count==n-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
    
}
