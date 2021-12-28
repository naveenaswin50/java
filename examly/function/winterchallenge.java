package examly.function;

import java.util.Scanner;

public class winterchallenge {
    static int findValue(int a,int b){
        for(int i=0;i<b;i++){
            int n=0;
            int temp=b*i;
            for(int j=0;j<temp;j++){
                n=a*j;
                if(n==temp+1)
                return j;
            }
        }
        return -1;   
    }
    public static void main(String[]as){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(findValue(a,b));
        sc.close();
    }
}

