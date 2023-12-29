import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int res = 0;
        while (i <5) {
            int n = sc.nextInt();
            if ( n%2 == 0) res++;
            i++;
        }
        System.out.println(res);
    }
}