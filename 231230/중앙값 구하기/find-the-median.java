import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int med = 0;
        if ( a < b) {
            if ( b < c) med = b;
            else med = c;
        } else if ( b < a){
            if ( b < c) med = a;
            else med = b;
        }
        System.out.println(med);
    }
}