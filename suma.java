// import java.util.*;
// public class suma {   
//     // int k=0;
// for (int i = 10; i > 0; i--) { 
//     while (i > 3) 
//         i -= 3; 
//         // k += 1;
//         }
// System.out.println(k); 
// }
import java.util.*;
class djaj {

        public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(),b=0;
            int st=a;
            int end=0;
            int c = 0;
            while (a != 0) {
                a=a/10;
                c++;
            }
            a=st;
            while (a != 0) {
                b = a % 10;
                end+=Math.pow(b,c);
                a=a/10;
            }
            if(st==end){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
            sc.close(); 
        }
	
}