package examly.function;

import java.util.Scanner;

public class nisenumber {
    static boolean findType(int n){
        int c=0;
        for(int i=n/2;i>=1;i--){
            if(n%i==0){
                c++;
            }
        }
        if(++c==4)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        sc.close();
        if(findType(s))
            System.out.println(s+" is a nice number");
        else
            System.out.println(s+" is not a nice number");
    }
}

 
