package examly.Arrays;
import java.util.*;
public class filimfeist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] movie=new int[n];
        int[] rating=new int[n];
        int max=0,index=0,cp=0;
        for(int i=0;i<n;i++){
            movie[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            rating[i]=sc.nextInt();
        }
        
        List<Integer> l=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(movie[i]*rating[i]);
            if(l.get(i)>max){
                max=l.get(i);
            }
        }
        for(int i=0;i<n;i++){
            if(max==l.get(i)){
                in.add(i);
                cp++;
            }
        }
        l.clear();
        int max2=0;
        if(cp>1){
            cp=0;
            for(int i=0;i<n;i++)
            {
                if(rating[in.get(i)]>=max2){
                    
                    
                    if(rating[in.get(i)]==max2){
                     continue;
                    }
                     index=in.get(i);
                     max2=rating[in.get(i)];
                }
            }
        
        System.out.println(index+1);
        }
        else{
            System.out.println(max);
        }
        sc.close();
    }
}