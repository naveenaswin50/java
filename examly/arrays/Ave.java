package array;

import java.util.*;

public class Ave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), I = 0, J = 0;
        int arr[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    I = i;
                    J = j;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; i++) {
                if ((i == I && j == J + 1) || (i == I + 1 && j == J) || (i == I && j == J - 1)
                        || (i == I + 1 && j == J - 1) || (i == I - 1 && j == J)) {
                    arr[i][j] = 0;
                }       
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
