import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while ( i< n) {
            int m = sc.nextInt();
            if (m%2 != 0 && m%3 == 0) System.out.println(m);
            i++;
        }
    }
}