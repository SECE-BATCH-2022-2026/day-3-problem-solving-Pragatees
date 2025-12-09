import java.util.*;

public class playstr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ind = sc.nextInt();
        sc.nextLine(); 
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        String res = "";

        for (String s : a) {
            if (s.length() > ind) {
                char ch = s.charAt(ind - 1);
                res += ch;
            } else {
                res += "$";
            }
        }
        System.out.print(res);
    }
}
