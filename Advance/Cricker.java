package Advance;
import java.util.*;

class Cricket {
    String name;
    int score;
    String opp;

    Cricket(String name, int Score, String opp) {
        this.name = name;
        this.score = Score;
        this.opp = opp;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cricket[] ct = new Cricket[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name : ");
            String a = sc.nextLine();
            System.out.print("Enter score : ");
            int b = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter opp : ");
            String c = sc.nextLine();
            ct[i] = new Cricket(a, b, c);

        }
        sc.close();
        for (int i = 0; i < 5; i++) {
            for (int j = i+1;j < 5; j++) {
                if (ct[i].score > ct[j].score) {
                    Cricket tp=ct[i];
                    ct[i]=ct[j];
                    ct[j]=tp;
                }
                else if (ct[i].score == ct[j].score) {
                    if(ct[i].name.compareToIgnoreCase(ct[j].name)>0){
                    Cricket tp=ct[i];
                    ct[i]=ct[j];
                    ct[j]=tp;
                    }
                }
            }
        }

        System.out.println("\n\n");

        for(int i=0;i<5;i++){
            System.out.println("Player No--->"+(i+1));
            System.out.println("Name : "+ct[i].name);
            System.out.println("Score : "+ct[i].score);
            System.out.println("Opp : "+ct[i].opp);
        }

    }
}