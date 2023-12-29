import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;
        int res = 1;
        while ( i <= b) {
            if(i%a == 0) {
                res = res*i;
            }
            i++;
        }
        System.out.println(res);
    }
}