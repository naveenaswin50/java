package Advance;
import java.util.*;
public class permutation {
    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); 
        String rem = str.substring(1); 
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b=sc.nextInt();
        Set<String> x=permutationFinder(s);
        // System.out.println(x);
        List<String> list = new ArrayList<String>();
        for(String i:x){
            if(Integer.parseInt(i)>b){
                list.add(i);
            }
        }
        if(list.size()==0){
            System.out.println("-1");
        }
        else{
            Collections.sort(list);
            System.out.println(list.get(0));
        }
        sc.close();
    }
}
