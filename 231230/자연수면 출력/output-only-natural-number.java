import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( a > 0) {
            int i = 0;
            while ( i < b) {
                System.out.print(a);
                i++;
            }
        } else System.out.println(0);

    }
}