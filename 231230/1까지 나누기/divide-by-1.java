import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while ( n>=1) {
            i++;    
            n=n/i;
        }
        System.out.println(i);

    }
}