import java.util.*;
public class thalavali {
    
}
class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n/2+1;
        int n2=n1-1;
    	for(int i=1;i<=n1;i++){
            for(int j=1;j<=(n1-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n2;i>=1;i--){
            for(int j=1;j<=(n2-i+1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}