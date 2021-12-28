import java.util.*;
public class Sol {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                if(k==j){
                    System.out.print("*");
                }else{
                System.out.print("0");
                }
            }
            for(int j=n;j>0;j--){
                if(k==j){
                    System.out.print("*");
                }else{
                System.out.print("0");
                }
            }
            System.out.println();
            k++;
        }
		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		
	}	


}
