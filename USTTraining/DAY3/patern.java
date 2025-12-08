import java.util.*;

class patern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(checker(inp));
    }

    public static boolean checker(String s) {
        return s.matches("CPT");
    }
}
