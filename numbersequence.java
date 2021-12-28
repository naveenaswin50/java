import java.util.*;
public class numbersequence {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n-1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int diff=arr[i]-arr[i+1];
            arr1[i]=diff;
            System.out.print(diff);
        }
        int c=0;
		for(int i=0;i<n-2;i++){
            if((arr1[i]<0&&arr1[i+1]>0)||(arr1[i]>0||arr1[i+1]<0)){
                c++;
                System.out.print(c);
            }
        }
        System.out.print(Arrays.toString(arr1));
        if(c<2){
            System.out.print(true);
        }else{
            System.out.print(false);
        }

	}
}