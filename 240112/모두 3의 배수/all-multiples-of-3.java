import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 1;
        for ( int i = 0; i <5; i++){
            int x = sc.nextInt();
            if (x%3 != 0) {
                res = 0;
            }
        }
        System.out.println(res);
    }
}