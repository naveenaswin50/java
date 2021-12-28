package infitq;
import java.util.*;

class Main {

    public static int swap(String str1, String str2,int n) {
        int[] freq = new int[52];

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                freq[str1.charAt(i) - 'a']++;
            } else {
                freq[str1.charAt(i) - 'A' + 26]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
                freq[str2.charAt(i) - 'a']--;
            } else {
                freq[str2.charAt(i) - 'A' + 26]--;
            }
        }

        for (int i = 0; i < 52; i++) {
            if (freq[i] != 0) {
                return -1;
            }
        }

        int i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(swap(str1, str2,n));
        sc.close();
    }
}