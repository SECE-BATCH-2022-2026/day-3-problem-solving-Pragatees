import java.util.*;
class Regexp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        Boolean f = Character.isLetterOrDigit(s.charAt(0));
        Boolean se = Character.isUpperCase(s.charAt(1));
        Boolean t = Character.isDigit(s.charAt(2));
        if(f && se && t){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
