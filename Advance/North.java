/*
Input:
5
0 1 0 1 0
        i=4
3   2     = 5

0 1 0 1 1
  1   2 2

*/
package Advance;
import java.util.*;
class North {
    private static Scanner sc;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            ar.add(t);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(ar.get(i)==0){
                for(int j=i+1;j<n;j++){
                    if(ar.get(j)==1)
                        res++;
                }
            }
        }
        System.out.println(res);

        int zc=0;
        int res2=0;
        for(int i:ar){
            if(i==1){
                res2 += zc;    
             }
            else{
                 zc++;
            }
        }
        System.out.println(res2);
    }
}
