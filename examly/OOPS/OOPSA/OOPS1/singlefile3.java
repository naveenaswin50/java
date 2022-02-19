import java.util.*;

class User {
    String str1="public void displayAll(User[] userArray)";
    String str2="public Boolean deleteUser(User[] userArrray,String name)";
    private static Scanner sc = new Scanner(System.in);
    String n;
    String mn;
    String un;
    String pw;

    User(String n, String mn, String un, String pw) {
        this.n = n;
        this.mn = mn;
        this.un = un;

        this.pw = pw;
    }

    User() {
    }

    public void displayAll(User[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i].n + " ");
            System.out.print(userArray[i].mn + " ");
            System.out.print(userArray[i].un + " ");
            System.out.print(userArray[i].pw + "\n");
        }
    }

    public Boolean deleteUser(User[] userArray, String name) {
        for (User i : userArray) {
            if (i.n.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] arr = new User[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String mn = sc.next();
            String un = sc.next();
            String pw = sc.next();
            arr[i] = new User(name, mn, un, pw);
        }
        String del = sc.next();
        User u = new User();
        u.displayAll(arr);
        if (u.deleteUser(arr, del)) {
            System.out.println("User deleted successfully");
        } else {
            System.out.println("No user found with the given name");
        }
    }
}
