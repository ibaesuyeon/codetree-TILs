import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;
        while ( a <= b) {
            if ( a%6 == 0 && a%8 !=0 ) res = res + a;
            a++;
        }
        System.out.println(res);
    }
}